package br.com.ecommerce.integration.cascostore.adapters.producer;

import br.com.ecommerce.integration.cascostore.adapters.database.model.dto.UserDto;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class SendMessageProducer {

    private final Producer<String, String> messageProducer;

    public SendMessageProducer(){
        messageProducer = criarProducer();
    }

    private Producer<String, String> criarProducer(){
        if (messageProducer != null) return messageProducer;

        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("serializer.class", "kafka.serializer.DefaultEncoder");

        return new KafkaProducer<String, String>(properties);
    }

    public void sendMessageKafka(UserDto userDto){
        ProducerRecord<String, String> record =  new ProducerRecord<String, String>("UserEvento",
                userDto.getDocumentNumber().toString(), userDto.toString());

        messageProducer.send(record);
        messageProducer.flush();

        messageProducer.close();
    }
}
