public interface BandejaEstado {
    void put(Bandeja bandeja, Pieza pieza);
    Pieza get(Bandeja bandeja);
    void updateState(Bandeja bandeja);
}
