package ru.cwcode.mtfporting.adapter;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;

public class JsonAdapter implements TextAdapter {
  @Override
  public Component serialize(String st) {
    return GsonComponentSerializer.gson().deserialize(st);
  }
  
  @Override
  public String deserialize(Component component) {
    return GsonComponentSerializer.gson().serialize(component);
  }
}
