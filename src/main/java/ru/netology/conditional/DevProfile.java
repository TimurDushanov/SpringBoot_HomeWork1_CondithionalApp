package ru.netology.conditional;

public class DevProfile implements SystemProfile{

    @Override
    public String getProfile() {
        return "Current profile is dev\n";
    }
}
