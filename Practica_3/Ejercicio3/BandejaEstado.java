public interface BandejaEstado {
    void put(Bandeja bandeja, Pieza pieza);
    Pieza get(Bandeja bandeja);
    void updateEstado(Bandeja bandeja);
}
