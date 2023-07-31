package Comparators;

import entity.Filmas;

import java.util.Comparator;
public class FilmasByZiurovuIvertinimas implements Comparator<Filmas> {
        @Override
        public int compare(Filmas o1, Filmas o2) {
            return Double.compare(o1.getZiurovuIvertinimas(), o2.getZiurovuIvertinimas());
        }
    }

