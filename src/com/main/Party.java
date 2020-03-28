package com.main;

import com.main.characters.CharaterClass;

public class Party {
    private CharaterClass[] partyMembers;
    public Party(CharaterClass... members){
        partyMembers = new CharaterClass[members.length];
        for(int i = 0; i < partyMembers.length; i++){
            partyMembers[i] = members[i];
        }
    }
//getter
    public CharaterClass[] getPartyMembers() {
        return partyMembers;
    }
//setter
    public void setPartyMembers(CharaterClass[] partyMembers) {
        this.partyMembers = partyMembers;
    }
    public void info(){
        for(CharaterClass partyMember : partyMembers){
            partyMember.info();
        }
    }
}
