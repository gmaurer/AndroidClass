package classproject.runescape;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class ApiRetrievalClass extends AsyncTask<String, Void, SkillsHolder> {
    private RetrivalCallBack mCallback;

    public ApiRetrievalClass(RetrivalCallBack callBack) {
        mCallback = callBack;

    }

    @Override
    protected SkillsHolder doInBackground(String... params) {
        return retrieveSkills(params[0]);
    }

    protected void onPostExecute(SkillsHolder result) {
        mCallback.onSuccess(result);
    }

    public interface RetrivalCallBack {
        void onSuccess(SkillsHolder skillsHolder);

    }


    HttpURLConnection urlConnection = null;
    BufferedReader reader = null;

    public SkillsHolder retrieveSkills(final String userName) {
        String urlstring;

        urlstring = "http://services.runescape.com/m=hiscore/index_lite.ws?player=" + userName;

        SkillsHolder skills;
        Log.d("Hey", urlstring);
        try {
            Log.d("start", urlstring);
            URL url = new URL(urlstring);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");

            //urlConnection.connect();

            Log.d("aaaa", urlstring);
            InputStream inputStream = urlConnection.getInputStream();
            Log.d("bae", urlstring);
            StringBuffer buffer = new StringBuffer();
            Log.d("day", urlstring);
            if (inputStream == null) {
                Log.d("null", urlstring);
            }
            reader = new BufferedReader(new InputStreamReader(inputStream));
            Log.d("bbbb", urlstring);
            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line + "\n");
            }
            Log.d("cccc", urlstring);
            if (buffer.length() == 0) {
                SkillsHolder badtemp = new SkillsHolder();
                badtemp.CreateError();
                skills = badtemp;
                return skills;
            }
            String rawData = buffer.toString();
            SkillsHolder output = RawStringParser(rawData);
            Log.d("here", urlstring);
            skills = output;
        } catch (Exception e) {
            Log.d("asdf", urlstring);
            SkillsHolder badtemp = new SkillsHolder();
            badtemp.CreateError();
            skills = badtemp;
        } finally {
            Log.d("qwerty", urlstring);
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (final IOException e) {
                    Log.e("PlaceholderFragment", "Error closing stream", e);
                }
            }
        }

        return skills;

    }

    public SkillsHolder RawStringParser(String rawdata) {
        SkillsHolder output = new SkillsHolder();
        String[] indvSkills = rawdata.split("\n");
        String[] temp;
        for (int i = 0; i < indvSkills.length; i++) {
            temp = indvSkills[i].split(",");
            if (temp.length == 3) {
                output.AddSkill(temp[1], temp[2], temp[0]);
            }
        }
        return output;
    }
}