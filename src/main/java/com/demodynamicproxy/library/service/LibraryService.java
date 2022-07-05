package com.demodynamicproxy.library.service;

import com.demodynamicproxy.Service;
import com.demodynamicproxy.library.entity.Library;

public interface LibraryService extends Service {
    Library searchForLibraryByLatitudeLongitude(long latitude, long longitude);
}
