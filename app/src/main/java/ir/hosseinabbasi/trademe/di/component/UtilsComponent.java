package ir.hosseinabbasi.trademe.di.component;

import ir.hosseinabbasi.trademe.utils.rx.ThreadTransformer;

/**
 * Created by Dr.jacky on 2018/03/09.
 */

public interface UtilsComponent {
    ThreadTransformer exposeThreadTransformer();
}
