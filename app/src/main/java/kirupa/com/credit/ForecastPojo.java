package kirupa.com.credit;

import java.util.List;

/**
 * Created by kirupa on 21/5/18.
 */

public class ForecastPojo {

    /**
     * cod : 200
     * message : 0.0123
     * cnt : 40
     * list : [{"dt":1526914800,"main":{"temp":303.82,"temp_min":303.82,"temp_max":303.942,"pressure":1018.58,"sea_level":1019.3,"grnd_level":1018.58,"humidity":87,"temp_kf":-0.12},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":5.86,"deg":170},"sys":{"pod":"n"},"dt_txt":"2018-05-21 15:00:00"},{"dt":1526925600,"main":{"temp":303.16,"temp_min":303.16,"temp_max":303.251,"pressure":1019.03,"sea_level":1019.67,"grnd_level":1019.03,"humidity":92,"temp_kf":-0.09},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":5.41,"deg":170.504},"sys":{"pod":"n"},"dt_txt":"2018-05-21 18:00:00"},{"dt":1526936400,"main":{"temp":302.63,"temp_min":302.63,"temp_max":302.693,"pressure":1017.59,"sea_level":1018.19,"grnd_level":1017.59,"humidity":96,"temp_kf":-0.06},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":3.67,"deg":209.002},"sys":{"pod":"n"},"dt_txt":"2018-05-21 21:00:00"},{"dt":1526947200,"main":{"temp":301.61,"temp_min":301.61,"temp_max":301.643,"pressure":1017.99,"sea_level":1018.63,"grnd_level":1017.99,"humidity":99,"temp_kf":-0.03},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":5.01,"deg":255.501},"sys":{"pod":"n"},"dt_txt":"2018-05-22 00:00:00"},{"dt":1526958000,"main":{"temp":303.861,"temp_min":303.861,"temp_max":303.861,"pressure":1019.22,"sea_level":1019.88,"grnd_level":1019.22,"humidity":89,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":4.45,"deg":249.003},"sys":{"pod":"d"},"dt_txt":"2018-05-22 03:00:00"},{"dt":1526968800,"main":{"temp":306.139,"temp_min":306.139,"temp_max":306.139,"pressure":1018.86,"sea_level":1019.52,"grnd_level":1018.86,"humidity":81,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":2.67,"deg":188.024},"sys":{"pod":"d"},"dt_txt":"2018-05-22 06:00:00"},{"dt":1526979600,"main":{"temp":305.639,"temp_min":305.639,"temp_max":305.639,"pressure":1017.18,"sea_level":1017.68,"grnd_level":1017.18,"humidity":81,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":5.56,"deg":130},"sys":{"pod":"d"},"dt_txt":"2018-05-22 09:00:00"},{"dt":1526990400,"main":{"temp":304.462,"temp_min":304.462,"temp_max":304.462,"pressure":1016.71,"sea_level":1017.31,"grnd_level":1016.71,"humidity":85,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":4.91,"deg":128.004},"sys":{"pod":"d"},"dt_txt":"2018-05-22 12:00:00"},{"dt":1527001200,"main":{"temp":303.265,"temp_min":303.265,"temp_max":303.265,"pressure":1019.25,"sea_level":1019.82,"grnd_level":1019.25,"humidity":93,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":3.75,"deg":135.504},"sys":{"pod":"n"},"dt_txt":"2018-05-22 15:00:00"},{"dt":1527012000,"main":{"temp":302.7,"temp_min":302.7,"temp_max":302.7,"pressure":1019.86,"sea_level":1020.56,"grnd_level":1019.86,"humidity":96,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":3.11,"deg":163.502},"sys":{"pod":"n"},"dt_txt":"2018-05-22 18:00:00"},{"dt":1527022800,"main":{"temp":301.71,"temp_min":301.71,"temp_max":301.71,"pressure":1018.34,"sea_level":1019.02,"grnd_level":1018.34,"humidity":100,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02n"}],"clouds":{"all":8},"wind":{"speed":2.96,"deg":210.002},"sys":{"pod":"n"},"dt_txt":"2018-05-22 21:00:00"},{"dt":1527033600,"main":{"temp":301.065,"temp_min":301.065,"temp_max":301.065,"pressure":1018.25,"sea_level":1018.92,"grnd_level":1018.25,"humidity":100,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02n"}],"clouds":{"all":8},"wind":{"speed":2.77,"deg":227.506},"sys":{"pod":"n"},"dt_txt":"2018-05-23 00:00:00"},{"dt":1527044400,"main":{"temp":303.025,"temp_min":303.025,"temp_max":303.025,"pressure":1020.2,"sea_level":1020.74,"grnd_level":1020.2,"humidity":94,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02d"}],"clouds":{"all":8},"wind":{"speed":3,"deg":237.003},"sys":{"pod":"d"},"dt_txt":"2018-05-23 03:00:00"},{"dt":1527055200,"main":{"temp":305.087,"temp_min":305.087,"temp_max":305.087,"pressure":1019.44,"sea_level":1020.05,"grnd_level":1019.44,"humidity":85,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":1.76,"deg":181.003},"sys":{"pod":"d"},"dt_txt":"2018-05-23 06:00:00"},{"dt":1527066000,"main":{"temp":305.11,"temp_min":305.11,"temp_max":305.11,"pressure":1017.13,"sea_level":1017.7,"grnd_level":1017.13,"humidity":83,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.32,"deg":108},"sys":{"pod":"d"},"dt_txt":"2018-05-23 09:00:00"},{"dt":1527076800,"main":{"temp":304.369,"temp_min":304.369,"temp_max":304.369,"pressure":1016.71,"sea_level":1017.28,"grnd_level":1016.71,"humidity":85,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02d"}],"clouds":{"all":8},"wind":{"speed":3.92,"deg":117.503},"sys":{"pod":"d"},"dt_txt":"2018-05-23 12:00:00"},{"dt":1527087600,"main":{"temp":303.373,"temp_min":303.373,"temp_max":303.373,"pressure":1018.77,"sea_level":1019.45,"grnd_level":1018.77,"humidity":92,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":12},"wind":{"speed":3.41,"deg":153},"sys":{"pod":"n"},"dt_txt":"2018-05-23 15:00:00"},{"dt":1527098400,"main":{"temp":302.798,"temp_min":302.798,"temp_max":302.798,"pressure":1018.91,"sea_level":1019.66,"grnd_level":1018.91,"humidity":95,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02n"}],"clouds":{"all":8},"wind":{"speed":2.52,"deg":168.504},"sys":{"pod":"n"},"dt_txt":"2018-05-23 18:00:00"},{"dt":1527109200,"main":{"temp":302.111,"temp_min":302.111,"temp_max":302.111,"pressure":1017.89,"sea_level":1018.55,"grnd_level":1017.89,"humidity":99,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":24},"wind":{"speed":2.9,"deg":211.002},"sys":{"pod":"n"},"dt_txt":"2018-05-23 21:00:00"},{"dt":1527120000,"main":{"temp":301.351,"temp_min":301.351,"temp_max":301.351,"pressure":1017.95,"sea_level":1018.62,"grnd_level":1017.95,"humidity":100,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":12},"wind":{"speed":2.52,"deg":245.501},"sys":{"pod":"n"},"dt_txt":"2018-05-24 00:00:00"},{"dt":1527130800,"main":{"temp":302.892,"temp_min":302.892,"temp_max":302.892,"pressure":1019.2,"sea_level":1019.88,"grnd_level":1019.2,"humidity":95,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":2.5,"deg":255.503},"sys":{"pod":"d"},"dt_txt":"2018-05-24 03:00:00"},{"dt":1527141600,"main":{"temp":304.668,"temp_min":304.668,"temp_max":304.668,"pressure":1018.84,"sea_level":1019.38,"grnd_level":1018.84,"humidity":88,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":0.73,"deg":127.005},"sys":{"pod":"d"},"dt_txt":"2018-05-24 06:00:00"},{"dt":1527152400,"main":{"temp":304.545,"temp_min":304.545,"temp_max":304.545,"pressure":1016.33,"sea_level":1016.87,"grnd_level":1016.33,"humidity":87,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.66,"deg":85.0011},"sys":{"pod":"d"},"dt_txt":"2018-05-24 09:00:00"},{"dt":1527163200,"main":{"temp":304.281,"temp_min":304.281,"temp_max":304.281,"pressure":1015.58,"sea_level":1016.17,"grnd_level":1015.58,"humidity":87,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":4.3,"deg":102.006},"sys":{"pod":"d"},"dt_txt":"2018-05-24 12:00:00"},{"dt":1527174000,"main":{"temp":303.375,"temp_min":303.375,"temp_max":303.375,"pressure":1017.5,"sea_level":1018.07,"grnd_level":1017.5,"humidity":92,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":3.31,"deg":133.002},"sys":{"pod":"n"},"dt_txt":"2018-05-24 15:00:00"},{"dt":1527184800,"main":{"temp":302.812,"temp_min":302.812,"temp_max":302.812,"pressure":1018.5,"sea_level":1019.16,"grnd_level":1018.5,"humidity":96,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":3.41,"deg":162.501},"sys":{"pod":"n"},"dt_txt":"2018-05-24 18:00:00"},{"dt":1527195600,"main":{"temp":302.205,"temp_min":302.205,"temp_max":302.205,"pressure":1016.82,"sea_level":1017.48,"grnd_level":1016.82,"humidity":99,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.22,"deg":192.502},"sys":{"pod":"n"},"dt_txt":"2018-05-24 21:00:00"},{"dt":1527206400,"main":{"temp":301.629,"temp_min":301.629,"temp_max":301.629,"pressure":1016.68,"sea_level":1017.3,"grnd_level":1016.68,"humidity":100,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.76,"deg":222.003},"sys":{"pod":"n"},"dt_txt":"2018-05-25 00:00:00"},{"dt":1527217200,"main":{"temp":303.04,"temp_min":303.04,"temp_max":303.04,"pressure":1017.96,"sea_level":1018.61,"grnd_level":1017.96,"humidity":94,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.76,"deg":241.506},"sys":{"pod":"d"},"dt_txt":"2018-05-25 03:00:00"},{"dt":1527228000,"main":{"temp":305.302,"temp_min":305.302,"temp_max":305.302,"pressure":1017.19,"sea_level":1017.8,"grnd_level":1017.19,"humidity":84,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":1.32,"deg":204.001},"sys":{"pod":"d"},"dt_txt":"2018-05-25 06:00:00"},{"dt":1527238800,"main":{"temp":305.06,"temp_min":305.06,"temp_max":305.06,"pressure":1015.15,"sea_level":1015.74,"grnd_level":1015.15,"humidity":84,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":4.11,"deg":115.001},"sys":{"pod":"d"},"dt_txt":"2018-05-25 09:00:00"},{"dt":1527249600,"main":{"temp":305.046,"temp_min":305.046,"temp_max":305.046,"pressure":1014.39,"sea_level":1015,"grnd_level":1014.39,"humidity":83,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":4.91,"deg":138.01},"sys":{"pod":"d"},"dt_txt":"2018-05-25 12:00:00"},{"dt":1527260400,"main":{"temp":303.957,"temp_min":303.957,"temp_max":303.957,"pressure":1016.5,"sea_level":1017.11,"grnd_level":1016.5,"humidity":89,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":12},"wind":{"speed":4.66,"deg":161},"sys":{"pod":"n"},"dt_txt":"2018-05-25 15:00:00"},{"dt":1527271200,"main":{"temp":302.889,"temp_min":302.889,"temp_max":302.889,"pressure":1017.13,"sea_level":1017.77,"grnd_level":1017.13,"humidity":94,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":20},"wind":{"speed":4.56,"deg":209.001},"sys":{"pod":"n"},"dt_txt":"2018-05-25 18:00:00"},{"dt":1527282000,"main":{"temp":300.914,"temp_min":300.914,"temp_max":300.914,"pressure":1016.16,"sea_level":1016.71,"grnd_level":1016.16,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":56},"wind":{"speed":6.45,"deg":234.001},"rain":{"3h":0.09},"sys":{"pod":"n"},"dt_txt":"2018-05-25 21:00:00"},{"dt":1527292800,"main":{"temp":300.897,"temp_min":300.897,"temp_max":300.897,"pressure":1015.13,"sea_level":1015.89,"grnd_level":1015.13,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":36},"wind":{"speed":5.58,"deg":251.002},"rain":{"3h":0.38},"sys":{"pod":"n"},"dt_txt":"2018-05-26 00:00:00"},{"dt":1527303600,"main":{"temp":303.022,"temp_min":303.022,"temp_max":303.022,"pressure":1015.91,"sea_level":1016.65,"grnd_level":1015.91,"humidity":91,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":36},"wind":{"speed":3.76,"deg":296},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-26 03:00:00"},{"dt":1527314400,"main":{"temp":305.603,"temp_min":305.603,"temp_max":305.603,"pressure":1015.99,"sea_level":1016.67,"grnd_level":1015.99,"humidity":81,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":64},"wind":{"speed":1.61,"deg":347.001},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-26 06:00:00"},{"dt":1527325200,"main":{"temp":305.525,"temp_min":305.525,"temp_max":305.525,"pressure":1013.6,"sea_level":1014.11,"grnd_level":1013.6,"humidity":82,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":36},"wind":{"speed":3.21,"deg":129.504},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-26 09:00:00"},{"dt":1527336000,"main":{"temp":303.609,"temp_min":303.609,"temp_max":303.609,"pressure":1013.65,"sea_level":1014.49,"grnd_level":1013.65,"humidity":90,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":44},"wind":{"speed":4.91,"deg":167.504},"rain":{"3h":0.2},"sys":{"pod":"d"},"dt_txt":"2018-05-26 12:00:00"}]
     * city : {"id":1264527,"name":"Chennai","coord":{"lat":13.0878,"lon":80.2785},"country":"IN","population":4328063}
     */

    private String cod;
    private double message;
    private int cnt;
    private CityBean city;
    private List<ListBean> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class CityBean {
        /**
         * id : 1264527
         * name : Chennai
         * coord : {"lat":13.0878,"lon":80.2785}
         * country : IN
         * population : 4328063
         */

        private int id;
        private String name;
        private CoordBean coord;
        private String country;
        private int population;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CoordBean getCoord() {
            return coord;
        }

        public void setCoord(CoordBean coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public static class CoordBean {
            /**
             * lat : 13.0878
             * lon : 80.2785
             */

            private double lat;
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }
    }

    public static class ListBean {
        /**
         * dt : 1526914800
         * main : {"temp":303.82,"temp_min":303.82,"temp_max":303.942,"pressure":1018.58,"sea_level":1019.3,"grnd_level":1018.58,"humidity":87,"temp_kf":-0.12}
         * weather : [{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}]
         * clouds : {"all":0}
         * wind : {"speed":5.86,"deg":170}
         * sys : {"pod":"n"}
         * dt_txt : 2018-05-21 15:00:00
         * rain : {"3h":0.09}
         */

        private int dt;
        private MainBean main;
        private CloudsBean clouds;
        private WindBean wind;
        private SysBean sys;
        private String dt_txt;
        private RainBean rain;
        private List<WeatherBean> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public MainBean getMain() {
            return main;
        }

        public void setMain(MainBean main) {
            this.main = main;
        }

        public CloudsBean getClouds() {
            return clouds;
        }

        public void setClouds(CloudsBean clouds) {
            this.clouds = clouds;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public SysBean getSys() {
            return sys;
        }

        public void setSys(SysBean sys) {
            this.sys = sys;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        public void setDt_txt(String dt_txt) {
            this.dt_txt = dt_txt;
        }

        public RainBean getRain() {
            return rain;
        }

        public void setRain(RainBean rain) {
            this.rain = rain;
        }

        public List<WeatherBean> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBean> weather) {
            this.weather = weather;
        }

        public static class MainBean {
            /**
             * temp : 303.82
             * temp_min : 303.82
             * temp_max : 303.942
             * pressure : 1018.58
             * sea_level : 1019.3
             * grnd_level : 1018.58
             * humidity : 87
             * temp_kf : -0.12
             */

            private double temp;
            private double temp_min;
            private double temp_max;
            private double pressure;
            private double sea_level;
            private double grnd_level;
            private int humidity;
            private double temp_kf;

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
            }

            public double getTemp_min() {
                return temp_min;
            }

            public void setTemp_min(double temp_min) {
                this.temp_min = temp_min;
            }

            public double getTemp_max() {
                return temp_max;
            }

            public void setTemp_max(double temp_max) {
                this.temp_max = temp_max;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getSea_level() {
                return sea_level;
            }

            public void setSea_level(double sea_level) {
                this.sea_level = sea_level;
            }

            public double getGrnd_level() {
                return grnd_level;
            }

            public void setGrnd_level(double grnd_level) {
                this.grnd_level = grnd_level;
            }

            public int getHumidity() {
                return humidity;
            }

            public void setHumidity(int humidity) {
                this.humidity = humidity;
            }

            public double getTemp_kf() {
                return temp_kf;
            }

            public void setTemp_kf(double temp_kf) {
                this.temp_kf = temp_kf;
            }
        }

        public static class CloudsBean {
            /**
             * all : 0
             */

            private int all;

            public int getAll() {
                return all;
            }

            public void setAll(int all) {
                this.all = all;
            }
        }

        public static class WindBean {
            /**
             * speed : 5.86
             * deg : 170
             */

            private double speed;
            private int deg;

            public double getSpeed() {
                return speed;
            }

            public void setSpeed(double speed) {
                this.speed = speed;
            }

            public int getDeg() {
                return deg;
            }

            public void setDeg(int deg) {
                this.deg = deg;
            }
        }

        public static class SysBean {
            /**
             * pod : n
             */

            private String pod;

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
        }

        public static class RainBean {
            /**
             * 3h : 0.09
             */

            @com.google.gson.annotations.SerializedName("3h")
            private double _$3h;

            public double get_$3h() {
                return _$3h;
            }

            public void set_$3h(double _$3h) {
                this._$3h = _$3h;
            }
        }

        public static class WeatherBean {
            /**
             * id : 800
             * main : Clear
             * description : clear sky
             * icon : 01n
             */

            private int id;
            private String main;
            private String description;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}
