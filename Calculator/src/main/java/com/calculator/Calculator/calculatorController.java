package com.calculator.Calculator;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hesapla")
public class calculatorController {


    @GetMapping("/topla")

    public int topla(@RequestParam int deger1,@RequestParam int deger2){

        return deger1 + deger2;

    }

    @PutMapping("/carp")
    public int carp(@RequestParam int deger1,@RequestParam int deger2){

        return deger1 + deger2;
    }

}
