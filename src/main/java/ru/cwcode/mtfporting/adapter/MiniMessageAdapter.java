package ru.cwcode.mtfporting.adapter;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;

public class MiniMessageAdapter implements TextAdapter{
  @Override
  public Component serialize(String st) {
    return MiniMessage.miniMessage().deserialize(st);
  }
  
  @Override
  public String deserialize(Component component) {
    return MiniMessage.miniMessage().serialize(component);
  }
}
