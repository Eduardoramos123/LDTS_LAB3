public class RomulanClient extends AlienClient {
    @Override
    protected OrderingStrategy createOrderingStrategy() {
        ImpatientStrategy strategy = new ImpatientStrategy();
        return strategy;
    }
}
