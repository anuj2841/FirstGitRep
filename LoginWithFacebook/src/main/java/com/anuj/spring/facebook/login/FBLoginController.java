package com.anuj.spring.facebook.login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FBLoginController {

	@GetMapping("/")
	public String home() {
		return "FBHome";
	}
    
	@GetMapping("/feboofackSucess")
	public void  facebookSuccessPage(@RequestParam("access_token")String access_token) throws IOException, JSONException {
			System.out.println("access_token:"+access_token);
			String url = "https://graph.facebook.com/v2.12/me?fields=id,name,picture,email&access_token="+access_token;
			URL obj = new URL(url);
		    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		    con.setRequestMethod("GET");//optional
		    int responseCode = con.getResponseCode();
		    System.out.println("\nSending 'GET' request to URL : " + url);
		    System.out.println("Response Code : " + responseCode);
		    BufferedReader in = new BufferedReader(
		             new InputStreamReader(con.getInputStream()));
		     String inputLine;
		     StringBuffer response = new StringBuffer();
		     while ((inputLine = in.readLine()) != null) {
		     	response.append(inputLine);
		     }
		     in.close();
		     System.out.println("response:"+response);
		     JSONObject myResponse = new JSONObject(response.toString());
		     Map<String,String> parameters=new HashMap<String,String>();
		     parameters.put("name", myResponse.getString("name"));
		     parameters.put("id", myResponse.getString("id"));
		     parameters.put("email", myResponse.getString("email"));
		     JSONObject picture_reponse=myResponse.getJSONObject("picture");
		     JSONObject data_response=picture_reponse.getJSONObject("data");
		     parameters.put("profilePhotoUrl", data_response.getString("url"));
	}

}
