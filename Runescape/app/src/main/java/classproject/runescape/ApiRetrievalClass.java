package classproject.runescape;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class ApiRetrievalClass {
<<<<<<< HEAD
    HttpURLConnection urlConnection = null;
    BufferedReader reader = null;

    public SkillsHolder retrieveSkills(String userName){
        String urlstring;

        urlstring = "http://services.runescape.com/m=hiscore/index_lite.ws?player=" + userName;

        SkillsHolder skills = new SkillsHolder();

        try {
            URL url = new URL(urlstring);
=======
    // These two need to be declared outside the try/catch
    // so that they can be closed in the finally block.
    HttpURLConnection urlConnection = null;
    BufferedReader reader = null;

    // Will contain the raw JSON response as a string.
    String apiInfo = null;

    public String json() {
        try {
            URL url = new URL("");

>>>>>>> 6a3fe93303a5290dd42c346bdc918934b9e6b79e
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            InputStream inputStream = urlConnection.getInputStream();
            StringBuffer buffer = new StringBuffer();
            if (inputStream == null) {
<<<<<<< HEAD
=======
                return null;
>>>>>>> 6a3fe93303a5290dd42c346bdc918934b9e6b79e
            }
            reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line + "\n");
            }

            if (buffer.length() == 0) {
<<<<<<< HEAD
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
=======
                return null;
            }
            apiInfo = buffer.toString();
        } catch (IOException e) {
            Log.e("PlaceholderFragment", "Error ", e);
            // to parse it.
            return null;
>>>>>>> 6a3fe93303a5290dd42c346bdc918934b9e6b79e
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
<<<<<<< HEAD
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
=======
            return "error";
        }
    }


>>>>>>> 6a3fe93303a5290dd42c346bdc918934b9e6b79e
}
