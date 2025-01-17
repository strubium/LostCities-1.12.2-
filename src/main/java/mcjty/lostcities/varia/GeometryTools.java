package mcjty.lostcities.varia;

import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class GeometryTools {

    public static double squaredDistanceBoxPoint(AxisAlignedBB chunkBox, BlockPos center) {
        double dmin = 0;

        if (center.getX() < chunkBox.minX) {
            dmin += Math.pow(center.getX() - chunkBox.minX, 2);
        } else if (center.getX() > chunkBox.maxX) {
            dmin += Math.pow(center.getX() - chunkBox.maxX, 2);
        }

        if (center.getY() < chunkBox.minY) {
            dmin += Math.pow(center.getY() - chunkBox.minY, 2);
        } else if (center.getY() > chunkBox.maxY) {
            dmin += Math.pow(center.getY() - chunkBox.maxY, 2);
        }

        if (center.getZ() < chunkBox.minZ) {
            dmin += Math.pow(center.getZ() - chunkBox.minZ, 2);
        } else if (center.getZ() > chunkBox.maxZ) {
            dmin += Math.pow(center.getZ() - chunkBox.maxZ, 2);
        }
        return dmin;
    }

    public static double maxSquaredDistanceBoxPoint(AxisAlignedBB chunkBox, BlockPos center) {
        double dmax = 0;

        if (center.getX() < (chunkBox.minX + chunkBox.maxX) / 2) {
            dmax += Math.pow(center.getX() - chunkBox.maxX, 2);
        } else {
            dmax += Math.pow(center.getX() - chunkBox.minX, 2);
        }

        if (center.getY() < (chunkBox.minY + chunkBox.maxY) / 2) {
            dmax += Math.pow(center.getY() - chunkBox.maxY, 2);
        } else {
            dmax += Math.pow(center.getY() - chunkBox.minY, 2);
        }

        if (center.getZ() < (chunkBox.minZ + chunkBox.maxZ) / 2) {
            dmax += Math.pow(center.getZ() - chunkBox.maxZ, 2);
        } else {
            dmax += Math.pow(center.getZ() - chunkBox.minZ, 2);
        }
        return dmax;
    }

    public static double squaredDistanceBoxPoint(AxisAlignedBB2D chunkBox, int x, int y) {
        double dmin = 0;

        if (x < chunkBox.minX) {
            dmin += Math.pow(x - chunkBox.minX, 2);
        } else if (x > chunkBox.maxX) {
            dmin += Math.pow(x - chunkBox.maxX, 2);
        }

        if (y < chunkBox.minY) {
            dmin += Math.pow(y - chunkBox.minY, 2);
        } else if (y > chunkBox.maxY) {
            dmin += Math.pow(y - chunkBox.maxY, 2);
        }
        return dmin;
    }

    public static class AxisAlignedBB2D {
        public final double minX;
        public final double minY;
        public final double maxX;
        public final double maxY;
        public int height;

        public AxisAlignedBB2D(double minX, double minY, double maxX, double maxY) {
            this.minX = minX;
            this.minY = minY;
            this.maxX = maxX;
            this.maxY = maxY;
        }

        public double getMinX() {
            return minX;
        }

        public double getMinY() {
            return minY;
        }

        public double getMaxX() {
            return maxX;
        }

        public double getMaxY() {
            return maxY;
        }
    }
}
