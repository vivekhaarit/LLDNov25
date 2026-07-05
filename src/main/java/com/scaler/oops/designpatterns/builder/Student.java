package com.scaler.oops.designpatterns.builder;

public class Student {
    String name;
    int age;
    String batch;
    double psp;
    int gradYear;

    private Student(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.psp = builder.getPsp();
        this.gradYear = builder.getGradYear();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    /// Inner Class of Student class.
    public static class Builder {
        String name;
        int age;
        String batch;
        double psp;
        int gradYear;

        private Builder() {        }

        public Student build() {
            //validations
            return new Student(this);
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
    }
}
