package com.raulmendoza.proyecto;

import android.Manifest;
import android.app.Fragment;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.raulmendoza.proyecto.Libreria.WindowAdapter;
import com.raulmendoza.proyecto.R;

/**
 * Created by Raul Mendoza on 16/11/2017.
 */


public class Mapa_Fragment extends Fragment implements OnMapReadyCallback//, GoogleMap.InfoWindowAdapter //para el primer adapter
{

    private GoogleMap mMap;

    /*private Context context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }*/

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mapa, container, false);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MapFragment fragment = (MapFragment) getChildFragmentManager().findFragmentById(R.id.mapa);
        fragment.getMapAsync(this);
    }

        @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
            // Add a marker in Sydney and move the camera
        final LatLng BBVA = new LatLng(-33.452702, -70.630427);
            /*Marker Banco = mMap.addMarker(new MarkerOptions()
                    .position(BBVA)
                    .title("Melbourne")
                    .snippet("Populat"));*/
            mMap.addMarker(new MarkerOptions().position(BBVA).title("BBVA"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        //UiSettings.setMapToolbarEnable(false);

        if (ActivityCompat.checkSelfPermission(getActivity().getApplicationContext(), Manifest.permission.ACCESS_FINE_LOCATION) ==
                PackageManager.PERMISSION_GRANTED || ActivityCompat.checkSelfPermission(getActivity().getApplicationContext(),
                Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
             mMap.setMyLocationEnabled(true);
        } else {
            Toast.makeText(getActivity().getApplicationContext(),"No hay permiso de ubicacion", Toast.LENGTH_LONG).show();
        }

        //mMap.setInfoWindowAdapter(new WindowAdapter(Mapa_Fragment.this));
        //mMap.setInfoWindowAdapter(getActivity().getApplicationContext());//Linea para el primer adapter
    }


    /*@Override
    public View getInfoWindow(Marker marker) {

        View view = LayoutInflater.from(MapsActivity.this).inflate(R.layout.info_adapter, null, false);
        return view;

    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }*/
}
