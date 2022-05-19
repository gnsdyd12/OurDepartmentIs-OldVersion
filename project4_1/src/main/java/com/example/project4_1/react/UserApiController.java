package com.example.project4_1.react;

import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserApiController {

    @PostMapping("/api/users")
    public User user() {
        System.out.println("UserApiController start...");
        User user = new User(1, "임은상", "1111", "dmstkd2905@naver.com");
        return user;
    }

    @RequestMapping(value="/api/checkEmail", method= RequestMethod.POST)
    public Map<String, Object> checkEmail(@RequestBody Map<String,Object> paramMap) throws SQLException, Exception {
        System.out.println(paramMap);
        Map <String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("JavaData", "YES");
        return resultMap;
    }
}