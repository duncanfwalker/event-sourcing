package com.understandingeek;

public class Store
{
    public void acceptDelivery(CommissioningChangeDelivered change) {

    }

    public void acceptEditorChange(ProgrammeEditorialised change) {

    }

    public Programme getProgramme() {

        return Programme.builder().title("").build();
    }
}
