package com.example.chess_multiplayer.DTO;

public class WaitingRoom {
    private String waitingRoomId;
    private String userCreateId;
    private int mode;

    public String getUserCreateId() {
        return userCreateId;
    }

    public void setUserCreateId(String userCreateId) {
        this.userCreateId = userCreateId;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }


    public String getWaitingRoomId() {
        return waitingRoomId;
    }

    public void setWaitingRoomId(String waitingRoomId) {
        this.waitingRoomId = waitingRoomId;
    }

}
