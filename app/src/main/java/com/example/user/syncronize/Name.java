package com.example.user.syncronize;

/**
 * Created by user on 12/12/2017.
 */

public class Name {
        private String name;
        private int status;

        public Name(String name, int status) {
            this.name = name;
            this.status = status;
        }

        public String getName() {
            return name;
        }

        public int getStatus() {
            return status;
        }
    }