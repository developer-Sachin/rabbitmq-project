package com.example.practice.domain;

public class Account {
    private final int id;
    private final String email;
    private final String address;
    private final String name;

    private Account(Builder builder){
           this.id = builder.id;
           this.email = builder.email;
           this.address = builder.address;
           this.name = builder.name;
    }
    public static class Builder{
        private int id;
        private String email;
        private String address;
        private String name;

        public Builder id(final int id){
            this.id = id;
            return this;
        }
        public Builder email(final String email){
            this.email = email;
            return this;
        }
        public Builder address(final String address){
            this.address = address;
            return this;
        }
        public Builder name(final String name){
            this.name = name;
            return this;
        }
        public Account build(){
            return new Account(this);
        }
    }

    public int getId() { return id; }

    public String getEmail() { return email; }

    public String getAddress() { return address; }

    public String getName() { return name; }
}
