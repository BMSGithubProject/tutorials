package com.bms.inheritancecomposition.model;

import java.util.Optional;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class Computer {

    private Processor processor;
    private Memory memory;
    private SoundCard soundCard;

    public Computer(Processor processor, Memory memory) {
        this.processor = processor;
        this.memory = memory;
    }
    
    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }
    
    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }
    
    public Optional<SoundCard> getSoundCard() {
        return Optional.ofNullable(soundCard);
    }
    
    @Override
    public String toString() {
        return "Computer{" + "processor=" + processor + ", memory=" + memory + ", soundcard=" + soundCard +"}";
    }
}
