package com.ashleyLavis.todolist;

import datamodel.ToDoData;
import datamodel.ToDoItems;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {

    @FXML
    private TextField shortDescriptionField;

    @FXML
    private TextArea detailsArea;

    @FXML
    private DatePicker deadlinePicker;

    public ToDoItems processResults(){
        String shortDescription = shortDescriptionField.getText().trim();
        String details  = detailsArea.getText().trim();
        LocalDate deadLineValue = deadlinePicker.getValue();

        ToDoItems newItem =new ToDoItems(shortDescription, details, deadLineValue);
        ToDoData.getInstance().addToDoItem(newItem);
        return newItem;
    }
}
