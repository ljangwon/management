package com.example.ljangwon.login;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    final static private String URL= "http://lmath.cafe24.com/Register.php";
    private Map<String, String> parameters;

    public RegisterRequest( String userId, String userPassword, String userName, String userAge, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userId", userId);
        parameters.put("userPassword", userPassword);
        parameters.put("userName", userName);
        parameters.put("userAge", userAge);

    }

    public Map<String, String> getParams() {
        return parameters;
    }
}
