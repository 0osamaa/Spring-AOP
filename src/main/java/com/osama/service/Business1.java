package com.osama.service;

import com.osama.annotations.TrackTime;
import com.osama.dao.Dao1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Business1 {

    @Autowired
    private Dao1 dao1;

    public String calculateSomething(){
        String value = dao1.retrieveSomething();

        log.info("In Business - {}", value);
//        throw new RuntimeException("Something went wrong");
        return value;
    }


    @TrackTime
    public int sumOfdigits(){

        String s = "12rs5w6yw1";
        int sum = 0;
        char[] characters = s.toCharArray();

        for (char c : characters){
            if (Character.isDigit(c))
            {
                sum = sum + Character.getNumericValue(c);
            }
        }
        System.out.println(sum);
        return sum;
        }
}