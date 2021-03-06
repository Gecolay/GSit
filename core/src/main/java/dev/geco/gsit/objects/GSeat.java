package dev.geco.gsit.objects;

import org.bukkit.*;
import org.bukkit.block.*;
import org.bukkit.entity.*;

public class GSeat {

    protected Block block;

    protected Location location;

    protected final LivingEntity entity;

    protected final Entity seatEntity;

    protected Location returnLocation;

    public GSeat(Block Block, Location Location, LivingEntity Entity, Entity SeatEntity, Location ReturnLocation) {

        block = Block;
        location = Location;
        entity = Entity;
        seatEntity = SeatEntity;
        returnLocation = ReturnLocation;
    }

    public Block getBlock() { return block; }

    public GSeat setBlock(Block Block) {

        block = Block;
        return this;
    }

    public Location getLocation() { return location.clone(); }

    public GSeat setLocation(Location Location) {

        location = Location.clone();
        return this;
    }

    public LivingEntity getEntity() { return entity; }

    public Entity getSeatEntity() { return seatEntity; }

    public Location getReturn() { return returnLocation.clone(); }

    public GSeat setReturn(Location ReturnLocation) {

        returnLocation = ReturnLocation.clone();
        return this;
    }

    public String toString() { return seatEntity.getUniqueId().toString(); }

}