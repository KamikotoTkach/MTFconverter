package ru.cwcode.mtfporting.adapter;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;

public class LegacyAdapter implements TextAdapter{
  @Override
  public Component serialize(String st) {
    return LegacyComponentSerializer.legacySection().deserialize(st);
  }
  
  @Override
  public String deserialize(Component st) {
    return LegacyComponentSerializer.legacySection().serialize(st);
    
  }
}
