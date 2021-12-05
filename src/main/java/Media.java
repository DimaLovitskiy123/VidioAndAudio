public class Media extends BasicAudioPlayer{


    public Media(String name,int duration, Format format){
        super(name, duration, format);
        this.name = name;
        this.duration = duration;
        this.format = format;
    }

    public String toString() {
        return "Название: " + name + ", Длительность: " + duration + " минут(ы)" + ", Формат: " + format;
    }


}
