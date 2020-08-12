package com.example.demo;

public class SaveResponse {
    private boolean error;
    private boolean hasNumber;
    private boolean correctLength;
    private boolean hasRegularLetter;
    private boolean hasUppercaseLetter;

    public SaveResponse(boolean error, boolean hasNumber, boolean correctLength, boolean hasRegularLetter, boolean hasUppercaseLetter) {
        this.error = error;
        this.hasNumber = hasNumber;
        this.correctLength = correctLength;
        this.hasRegularLetter = hasRegularLetter;
        this.hasUppercaseLetter = hasUppercaseLetter;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public boolean isHasNumber() {
        return hasNumber;
    }

    public void setHasNumber(boolean hasNumber) {
        this.hasNumber = hasNumber;
    }

    public boolean isCorrectLength() {
        return correctLength;
    }

    public void setCorrectLength(boolean correctLength) {
        this.correctLength = correctLength;
    }

    public boolean isHasRegularLetter() {
        return hasRegularLetter;
    }

    public void setHasRegularLetter(boolean hasRegularLetter) {
        this.hasRegularLetter = hasRegularLetter;
    }

    public boolean isHasUppercaseLetter() {
        return hasUppercaseLetter;
    }

    public void setHasUppercaseLetter(boolean hasUppercaseLetter) {
        this.hasUppercaseLetter = hasUppercaseLetter;
    }
}
