package ua.homework.Lesson11;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class PC {

    String ps;
    String store;
    CPU cpu;
    MotherBoard motherBoard;

    public PC(String ps, String store){
        this.ps = ps;
        this.store = store;
    }

    public PC(String ps, String store, CPU cpu){
        this.ps = ps;
        this.store = store;
        this.cpu = cpu;
    }

    public PC(String ps, String store, MotherBoard motherBoard){
        this.ps = ps;
        this.store = store;
        this.motherBoard = motherBoard;
    }
    public PC(String ps, String store, CPU cpu, MotherBoard motherBoard){
        this.ps = ps;
        this.store = store;
        this.motherBoard = motherBoard;
    }

    void setCpu(String model, String mark, double frequency){
        this.cpu = new CPU(model, mark, frequency);
    }

    void setMotherBoard(String model, String mark,String socket){
        this.motherBoard = new MotherBoard(model,mark,socket);
    }

    public void overClocking(){
        this.cpu.boostFrequency();
    }

    String getinfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("PS : ").append(this.ps).append("\n");
        sb.append("store : ").append(this.store).append("\n");
        if(cpu != null) {
            sb.append(cpu.getInfo()).append("\n");
        }else {
            sb.append("No CPU").append("\n");
        }
        if(motherBoard != null) {
            sb.append(motherBoard.getInfo()).append("\n");
        }else {
            sb.append("No MotherBoard").append("\n");
        }


        return sb.toString();
    }


    // TODO Inner Classes
    // TODO: MotherBoard = Model, Mark, Sockek
    // TODO CPU = Model, Mark, Frequency
    private class MotherBoard{
        String model;
        String mark;
        String socket;

        public MotherBoard(String model, String mark,  String socket){
            this.model = model;
            this.mark = mark;
            this.socket = socket;
        }
        String getInfo(){
            StringBuilder sb = new StringBuilder();
            sb.append("*************MotherBoard******************").append("\n");
            sb.append("model : " ).append(this.model).append("\n");
            sb.append("mark : " ).append(this.mark).append("\n");
            sb.append("socket : " ).append(this.socket).append("\n");
            sb.append("-------------MotherBoard------------------").append("\n");
            return sb.toString();
        }
    }

    private class CPU {
        String model;
        String mark;
        double frequency;
        boolean isBoosted = false;

        public CPU(String model, String mark, double frequency){
            this.model = model;
            this.mark = mark;
            this.frequency = frequency;
        }
        public double getFrequency(){
            return this.frequency;
        }

        public void boostFrequency(){
            this.frequency = this.frequency*1.5;
            isBoosted = true;

        }
        public void stockFrequency(){
            this.frequency = this.frequency/1.5;
            isBoosted = false;
        }

        String getInfo(){
            StringBuilder sb = new StringBuilder();
            sb.append("*************CPU******************").append("\n");
            sb.append("model : ").append(this.model).append("\n");
            sb.append("mark : ").append(this.mark).append("\n");
            sb.append("frequency : ").append(this.frequency).append("\n");
            sb.append("isBoosted : ").append(this.isBoosted?"Boosted":"NotBoosted").append("\n");
            sb.append("-------------CPU------------------").append("\n");
            return sb.toString();
        }
    }
}

