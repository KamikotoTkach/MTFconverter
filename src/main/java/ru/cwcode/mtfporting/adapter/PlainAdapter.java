package ru.cwcode.mtfporting.adapter;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;

public class PlainAdapter implements TextAdapter{
  @Override
  public Component serialize(String st) {
    return PlainTextComponentSerializer.plainText().deserialize(st);
  }
  
  @Override
  public String deserialize(Component st) {
    return PlainTextComponentSerializer.plainText().serialize(st);
  }
}
