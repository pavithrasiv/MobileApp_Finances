package com.example.mobileapp_finances;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.firebase.firestore.FirebaseFirestore;

public class Chart extends AppCompatActivity {

//    FirebaseFirestore firestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);

//        firestore = FirebaseFirestore.getInstance();
    }

    public void AddExpense(View view) {
        setContentView(R.layout.activity_add_expense);
    }

//    public void AddIncome() {
//        setContentView(R.layout.activity_add_income);
//    }
}