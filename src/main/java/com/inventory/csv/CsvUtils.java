//package com.inventory.csv;
//
//import com.inventory.model.OrderEntity;
//
//import java.io.PrintWriter;
//import java.util.List;
//
//public class CsvUtils {
//    public static void downloadCsv(PrintWriter writer, List<OrderEntity> order){
//        writer.write("OrderId, OrderItem, OrderCreatedAt, OrderDelivered, OrderBillingAddress, OrderItems, Users, PaymentStatus");
//        for (OrderEntity orderEntity : order){
//            writer.write(orderEntity.getOrderId()+","+orderEntity.getOrderAmt()+","+orderEntity.getOrderCreatedAt()+","+orderEntity.getOrderDelivered()+","+orderEntity.getBillingAddress()+","+orderEntity.getOrderItems()+","+orderEntity.getUser()+","+orderEntity.getPaymentStatus());
//        }
//    }
//}
