package com.endava.internship.dependecyInversion.bad;

public class Manager {
    Worker worker;

    public Manager(Worker worker) {
        this.worker = worker;
    }

    public Worker getWorker() {
        return worker;
    }

    public Manager setWorker(Worker worker) {
        this.worker = worker;
        return this;
    }

    public void manage() {
        worker.work();
    }
}
