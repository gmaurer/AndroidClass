package classproject.runescape;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class ApiRetrievalClass {
    HttpURLConnection urlConnection = null;
    BufferedReader reader = null;

    public SkillsHolder retrieveSkills(String userName){
        String urlstring;

        urlstring = "http://services.runescape.com/m=hiscore/index_lite.ws?player=" + userName;

        SkillsHolder skills = new SkillsHolder();
        Log.d("Hey",urlstring);
        try {
            Log.d("start",urlstring);
            URL url = new URL(urlstring);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");

            //urlConnection.connect();

            Log.d("aaaa",urlstring);
            InputStream inputStream = urlConnection.getInputStream();
            StringBuffer buffer = new StringBuffer();
            if (inputStream == null) {
            }
            reader = new BufferedReader(new InputStreamReader(inputStream));
            Log.d("bbbb",urlstring);
            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line + "\n");
            }
            Log.d("cccc",urlstring);
            if (buffer.length() == 0) {
                SkillsHolder badtemp =  new SkillsHolder();
                badtemp.CreateError();
                return badtemp;
            }
            String rawData = buffer.toString();
            SkillsHolder output = RawStringParser(rawData);
            Log.d("here",urlstring);
            return output;
        } catch (Exception e) {
            Log.d("asdf",urlstring);
            SkillsHolder badtemp =  new SkillsHolder();
            badtemp.CreateError();
            return badtemp;
        } finally {
            Log.d("qwwwqq",urlstring);
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
            SkillsHolder badtemp =  new SkillsHolder();
            badtemp.CreateError();
            return badtemp;
        }
    }

    public SkillsHolder RawStringParser(String rawdata){
        SkillsHolder output = new SkillsHolder();
        String[] indvSkills = rawdata.split(" ");
        String[] temp;
        for(int i = 0; i < 28; i++){
            temp = indvSkills[i].split(",");
            output.AddSkill(temp[1], temp[2], temp[0]);
        }
        return output;
    }
}