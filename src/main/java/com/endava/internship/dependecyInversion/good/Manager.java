package com.endava.internship.dependecyInversion.good;

public class Manager {
    IWorker worker;

    public Manager(IWorker worker) {
        this.worker = worker;
    }

    public IWorker getWorker() {
        return worker;
    }

    public Manager setWorker(IWorker worker) {
        this.worker = worker;
        return this;
    }

    public void manage() {
        worker.work();
    }
}
