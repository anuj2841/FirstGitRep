package com.anuj.spring.google.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;

@Controller
public class LoginWithGoogleController {
	
	@GetMapping("/")
	public String googleLoginButton() {
		return "GoogleLoginButton";
	}
	
	@PostMapping(value = "/loginSuccessPage")
	public String redirectingAftersuccessfullLogin(@RequestParam("tokenString")String tokenString) throws Exception{
		System.out.println("tokenString:"+tokenString);
		GoogleIdToken.Payload payLoad = IdTokenVerifierAndParser.getPayload(tokenString);
		System.out.println("payLoad:"+payLoad.get("name"));
		return "LoginSuccessPage";
	}
}
