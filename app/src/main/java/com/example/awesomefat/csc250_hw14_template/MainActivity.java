package com.example.awesomefat.csc250_hw14_template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person[] persons = new Person[5];
        persons[0] = new Patient("Mike", "Litman", 21, "male", 125.31);
        persons[1] = new Patient("Gail", "Litman", 40, "female", 13.28);
        persons[2] = new Patient("David", "Litman", 19, "male", 0);
        persons[3] = new Patient("Larry", "Litman", 42, "male", 427);
        persons[4] = new Patient("david", "Litman", 19, "male", 52771.08);

        Arrays.sort(persons);
        this.printArray(persons);
    }

    private void printArray(Person[] p)
    {
        for(int i = 0; i < p.length; i++)
        {
            System.out.println(p[i]);
        }
    }
}
