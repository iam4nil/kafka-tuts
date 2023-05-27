package guru.learningjournal.kafka.examples;

class AppConfigs {
    final static String applicationID = "HelloProducer";
    final static String bootstrapServers = "localhost:9092";
    final static String topicName = "hello-producer-topic";
    final static int numEvents = 1000000;
}
