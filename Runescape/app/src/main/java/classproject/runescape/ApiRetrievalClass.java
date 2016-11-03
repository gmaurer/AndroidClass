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

        try {
            URL url = new URL(urlstring);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            InputStream inputStream = urlConnection.getInputStream();
            StringBuffer buffer = new StringBuffer();
            if (inputStream == null) {
            }
            reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line + "\n");
            }

            if (buffer.length() == 0) {
                SkillsHolder badtemp =  new SkillsHolder();
                badtemp.CreateError();
                return badtemp;
            }
            String rawData = buffer.toString();
            SkillsHolder output = RawStringParser(rawData);
        } catch (Exception e) {
            SkillsHolder badtemp =  new SkillsHolder();
            badtemp.CreateError();
            return badtemp;
        } finally {
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
