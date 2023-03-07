module ru.cwcode.mtfporting {
  requires javafx.controls;
  requires javafx.fxml;
  requires javafx.base;
  requires javafx.graphics;
  
  requires org.kordamp.bootstrapfx.core;
  requires net.kyori.adventure.text.minimessage;
  requires net.kyori.adventure.text.serializer.legacy;
  requires net.kyori.adventure.text.serializer.plain;
  requires net.kyori.adventure.text.serializer.gson;
  requires net.kyori.adventure;
  requires java.sql;
  
  opens ru.cwcode.mtfporting to javafx.fxml;
  exports ru.cwcode.mtfporting;
  exports ru.cwcode.mtfporting.adapter;
  opens ru.cwcode.mtfporting.adapter to javafx.fxml;
}