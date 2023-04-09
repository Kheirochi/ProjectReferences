package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfViewActivity2 extends AppCompatActivity {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view2);

        getSupportActionBar().hide();

        pdfView = findViewById(R.id.pdfView);

        int pos = getIntent().getIntExtra("position",0);
        switch (pos) {
            case 0:
                pdfView.fromAsset("Lecture 01.pdf").load();
                break;
            case 1:
                pdfView.fromAsset("Lecture 02.pdf").load();
                break;
            case 2:
                pdfView.fromAsset("Lecture 03.pdf").load();
                break;
            case 3:
                pdfView.fromAsset("Lecture 04.pdf").load();
                break;
            case 4:
                pdfView.fromAsset("Lecture 05.pdf").load();
                break;
            case 5:
                pdfView.fromAsset("Lecture 06.pdf").load();
                break;
            case 6:
                pdfView.fromAsset("Lecture 07.pdf").load();
                break;
        }

    }
}