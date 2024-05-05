import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class class166
{
    Map field1417;
    public static final int af = -1;
    static final int an = 0;
    UrlRequest field1418;
    public static final int au = 100;
    static final int ab = 100;
    static final int al = 102;
    int field1419;
    String field1421;
    public static final int ac = 2;
    String field1420;
    float[] field1422;
    ArrayList field1423;
    ArrayList field1424;
    ArrayList field1425;
    Map field1426;
    static final int aw = 1;
    
    public class166() {
        this.field1419 = -88536347;
        this.field1420 = null;
        this.field1422 = new float[4];
        this.field1423 = new ArrayList();
        this.field1424 = new ArrayList();
        this.field1425 = new ArrayList();
        this.field1426 = new HashMap();
        this.field1417 = new HashMap();
    }
    
    public String bs() {
        return this.field1421;
    }
    
    void ca(final JSONObject jsonObject) throws JSONException {
        if (null == jsonObject) {
            return;
        }
        this.field1422 = UserComparator8.method686(jsonObject, "clickbounds", 1045072731);
        this.field1420 = jsonObject.getString("endpoint");
        final String[] names = JSONObject.getNames(jsonObject);
        for (int i = 0; i < jsonObject.length(); ++i) {
            if (!names[i].equals("clickbounds") && !names[i].equals("endpoint")) {
                try {
                    this.field1423.add(new class174(this, names[i], jsonObject.getInt(names[i])));
                }
                catch (Exception ex) {
                    try {
                        final String string = jsonObject.getString(names[i]);
                        if (string.equals("true")) {
                            this.field1423.add(new class174(this, names[i], 1));
                        }
                        else if (string.equals("false")) {
                            this.field1423.add(new class174(this, names[i], 0));
                        }
                        else {
                            this.field1423.add(new class165(this, names[i], string));
                        }
                    }
                    catch (Exception ex2) {}
                }
            }
        }
    }
    
    public void ad(final UrlRequester urlRequester) {
        switch (this.field1419 * 371416339) {
            default: {}
            case 0: {
                this.method943(urlRequester, -636482972);
                break;
            }
            case 1: {
                this.method928(1483902133);
                break;
            }
        }
    }
    
    public void ae(final UrlRequester urlRequester) {
        switch (this.field1419 * 371416339) {
            case 0: {
                this.method943(urlRequester, 397278609);
                break;
            }
            default: {}
            case 1: {
                this.method928(-893764048);
                break;
            }
        }
    }
    
    static float[] cr(final JSONObject jsonObject, final String s) throws JSONException {
        final float[] array = new float[4];
        try {
            final JSONArray jsonArray = jsonObject.getJSONArray(s);
            array[0] = (float)jsonArray.optDouble(0, 0.0);
            array[1] = (float)jsonArray.optDouble(1, 0.0);
            array[2] = (float)jsonArray.optDouble(2, 1.0);
            array[3] = (float)jsonArray.optDouble(3, 1.0);
        }
        catch (JSONException ex) {
            array[1] = (array[0] = 0.0f);
            array[3] = (array[2] = 1.0f);
        }
        return array;
    }
    
    void ce(final JSONArray jsonArray, final UrlRequester urlRequester) throws JSONException {
        if (jsonArray == null) {
            return;
        }
        for (int i = 0; i < jsonArray.length(); ++i) {
            try {
                final JSONObject jsonObject = jsonArray.getJSONObject(i);
                final class172 e = new class172(this);
                e.field1445 = urlRequester.request(new URL(jsonObject.getString("src")), -780219076);
                e.field1444 = UserComparator8.method686(jsonObject, "placement", 237489120);
                this.field1424.add(e);
            }
            catch (MalformedURLException ex) {}
        }
    }
    
    void cl(final class437 class437, final UrlRequester urlRequester) {
        JSONObject jsonObject;
        try {
            jsonObject = class437.hj(class437, -288365426).getJSONObject("message");
        }
        catch (Exception ex) {
            sg(this, 907347917);
            this.field1419 = 1970843374;
            return;
        }
        try {
            this.method934(jsonObject.getJSONArray("images"), urlRequester, 2041464667);
        }
        catch (Exception ex2) {
            this.field1424.clear();
        }
        try {
            this.method935(jsonObject.getJSONArray("labels"), (byte)3);
        }
        catch (Exception ex3) {
            this.field1425.clear();
        }
        try {
            this.method936(jsonObject.getJSONObject("behaviour"), -28927295);
        }
        catch (Exception ex4) {
            this.field1420 = null;
            this.field1422[0] = 0.0f;
            this.field1422[1] = 0.0f;
            this.field1422[2] = 1.0f;
            this.field1422[3] = 1.0f;
            this.field1423.clear();
        }
        try {
            this.method941(jsonObject.getJSONObject("meta"), 891662681);
        }
        catch (Exception ex5) {
            this.field1426.clear();
            this.field1417.clear();
        }
    }
    
    void cn(final JSONObject jsonObject) throws JSONException {
        if (null == jsonObject) {
            return;
        }
        this.field1422 = UserComparator8.method686(jsonObject, "clickbounds", -766282553);
        this.field1420 = jsonObject.getString("endpoint");
        final String[] names = JSONObject.getNames(jsonObject);
        for (int i = 0; i < jsonObject.length(); ++i) {
            if (!names[i].equals("clickbounds") && !names[i].equals("endpoint")) {
                try {
                    this.field1423.add(new class174(this, names[i], jsonObject.getInt(names[i])));
                }
                catch (Exception ex) {
                    try {
                        final String string = jsonObject.getString(names[i]);
                        if (string.equals("true")) {
                            this.field1423.add(new class174(this, names[i], 1));
                        }
                        else if (string.equals("false")) {
                            this.field1423.add(new class174(this, names[i], 0));
                        }
                        else {
                            this.field1423.add(new class165(this, names[i], string));
                        }
                    }
                    catch (Exception ex2) {}
                }
            }
        }
    }
    
    void bw(final JSONArray jsonArray, final UrlRequester urlRequester) throws JSONException {
        if (jsonArray == null) {
            return;
        }
        for (int i = 0; i < jsonArray.length(); ++i) {
            try {
                final JSONObject jsonObject = jsonArray.getJSONObject(i);
                final class172 e = new class172(this);
                e.field1445 = urlRequester.request(new URL(jsonObject.getString("src")), -1261220429);
                e.field1444 = UserComparator8.method686(jsonObject, "placement", 736241133);
                this.field1424.add(e);
            }
            catch (MalformedURLException ex) {}
        }
    }
    
    void cf(final class437 class437, final UrlRequester urlRequester) {
        JSONObject jsonObject;
        try {
            jsonObject = class437.hj(class437, -288365426).getJSONObject("message");
        }
        catch (Exception ex) {
            sg(this, 2078146807);
            this.field1419 = 440772802;
            return;
        }
        try {
            this.method934(jsonObject.getJSONArray("images"), urlRequester, 2041464667);
        }
        catch (Exception ex2) {
            this.field1424.clear();
        }
        try {
            this.method935(jsonObject.getJSONArray("labels"), (byte)3);
        }
        catch (Exception ex3) {
            this.field1425.clear();
        }
        try {
            this.method936(jsonObject.getJSONObject("behaviour"), -28927295);
        }
        catch (Exception ex4) {
            this.field1420 = null;
            this.field1422[0] = 0.0f;
            this.field1422[1] = 0.0f;
            this.field1422[2] = 1.0f;
            this.field1422[3] = 1.0f;
            this.field1423.clear();
        }
        try {
            this.method941(jsonObject.getJSONObject("meta"), 891662681);
        }
        catch (Exception ex5) {
            this.field1426.clear();
            this.field1417.clear();
        }
    }
    
    void method943(final UrlRequester urlRequester, final int n) {
        try {
            if (null != this.field1418) {
                if (n <= -1178895622) {
                    throw new IllegalStateException();
                }
                if (!this.field1418.isDone((byte)(-40))) {
                    if (n <= -1178895622) {
                        return;
                    }
                }
                else {
                    final byte[] response = this.field1418.getResponse((byte)77);
                    if (response != null) {
                        try {
                            this.method937(new class437(response), urlRequester, 1522687051);
                        }
                        catch (UnsupportedEncodingException ex2) {
                            sg(this, -510587846);
                            this.field1419 = 440772802;
                            return;
                        }
                        int n2;
                        if (this.field1424.size() > 0) {
                            if (n <= -1178895622) {
                                return;
                            }
                            n2 = 1;
                        }
                        else {
                            n2 = 2;
                        }
                        this.field1419 = n2 * 88536347;
                        this.field1418 = null;
                        return;
                    }
                    if (n <= -1178895622) {
                        throw new IllegalStateException();
                    }
                    sg(this, 865668444);
                    this.field1419 = 263700108;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.ao(" + ')');
        }
    }
    
    public float[] method930(final int n) {
        try {
            return this.field1422;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.at(" + ')');
        }
    }
    
    public boolean ak(final String field1421, final UrlRequester urlRequester) {
        if (field1421 == null || field1421.isEmpty()) {
            return false;
        }
        if (urlRequester == null) {
            return false;
        }
        sg(this, 1314277816);
        try {
            this.field1421 = field1421;
            this.field1418 = urlRequester.request(new URL(this.field1421), -1139420171);
            this.field1419 = 0;
            return true;
        }
        catch (MalformedURLException ex) {
            sg(this, 1163195684);
            this.field1419 = 263700108;
            return false;
        }
    }
    
    void method941(final JSONObject jsonObject, final int n) throws JSONException {
        try {
            final String[] names = JSONObject.getNames(jsonObject);
            for (int i = 0; i < jsonObject.length(); ++i) {
                if (n != 891662681) {
                    throw new IllegalStateException();
                }
                try {
                    this.field1426.put(names[i], jsonObject.getInt(names[i]));
                }
                catch (Exception ex2) {
                    try {
                        final String string = jsonObject.getString(names[i]);
                        if (string.equals("true")) {
                            if (n != 891662681) {
                                throw new IllegalStateException();
                            }
                            this.field1426.put(names[i], 1);
                        }
                        else if (string.equals("false")) {
                            if (n != 891662681) {
                                throw new IllegalStateException();
                            }
                            this.field1426.put(names[i], 0);
                        }
                        else {
                            this.field1417.put(names[i], string);
                        }
                    }
                    catch (Exception ex3) {}
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.av(" + ')');
        }
    }
    
    public int be(final String s) {
        return this.field1426.containsKey(s) ? this.field1426.get(s) : -1;
    }
    
    public static String li(final class166 class166, final byte b) {
        if (class166 == null) {
            class166.method940(b);
        }
        try {
            return class166.field1420;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.al(" + ')');
        }
    }
    
    public boolean az(final String field1421, final UrlRequester urlRequester) {
        if (field1421 == null || field1421.isEmpty()) {
            return false;
        }
        if (urlRequester == null) {
            return false;
        }
        sg(this, -212417968);
        try {
            this.field1421 = field1421;
            this.field1418 = urlRequester.request(new URL(this.field1421), -1241961735);
            this.field1419 = 0;
            return true;
        }
        catch (MalformedURLException ex) {
            sg(this, 266440923);
            this.field1419 = 263700108;
            return false;
        }
    }
    
    void method928(final int n) {
        try {
            final Iterator<class172> iterator = this.field1424.iterator();
            while (iterator.hasNext()) {
                if (n == 605569579) {
                    throw new IllegalStateException();
                }
                final class172 class172 = iterator.next();
                if (class172.field1445 == null || class172.field1445.isDone((byte)9)) {
                    continue;
                }
                if (n == 605569579) {
                    throw new IllegalStateException();
                }
                return;
            }
            for (final class172 class173 : this.field1424) {
                if (null != class173.field1445) {
                    if (n == 605569579) {
                        return;
                    }
                    final byte[] response = class173.field1445.getResponse((byte)(-22));
                    if (null == response) {
                        continue;
                    }
                    if (n == 605569579) {
                        return;
                    }
                    if (response.length <= 0) {
                        continue;
                    }
                    if (n == 605569579) {
                        throw new IllegalStateException();
                    }
                    this.field1419 = 177072694;
                    return;
                }
            }
            sg(this, 1258490797);
            this.field1419 = 352236455;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.ax(" + ')');
        }
    }
    
    public static int method932(final class166 class166, final String s, final byte b) {
        if (class166 == null) {
            class166.method933(s, b);
        }
        try {
            int intValue;
            if (class166.field1426.containsKey(s)) {
                if (b == 7) {
                    throw new IllegalStateException();
                }
                intValue = class166.field1426.get(s);
            }
            else {
                intValue = -1;
            }
            return intValue;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.ac(" + ')');
        }
    }
    
    void method932(final int n) {
        try {
            final Iterator<class172> iterator = this.field1423.iterator();
            while (iterator.hasNext()) {
                if (n == 605569579) {
                    throw new IllegalStateException();
                }
                final class172 class172 = iterator.next();
                if (class172.field1445 == null || class172.field1445.isDone((byte)9)) {
                    continue;
                }
                if (n == 605569579) {
                    throw new IllegalStateException();
                }
                return;
            }
            for (final class172 class173 : this.field1425) {
                if (null != class173.field1445) {
                    if (n == 605569579) {
                        return;
                    }
                    final byte[] response = class173.field1445.getResponse((byte)(-22));
                    if (null == response) {
                        continue;
                    }
                    if (n == 605569579) {
                        return;
                    }
                    if (response.length <= 0) {
                        continue;
                    }
                    if (n == 605569579) {
                        throw new IllegalStateException();
                    }
                    this.field1419 = 177072694;
                    return;
                }
            }
            sg(this, 1258490797);
            this.field1419 = 352236455;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.ax(" + ')');
        }
    }
    
    public int bi() {
        return 371416339 * this.field1419;
    }
    
    void bv() {
        this.field1418 = null;
        this.field1420 = null;
        this.field1422[0] = 0.0f;
        this.field1422[1] = 0.0f;
        this.field1422[2] = 1.0f;
        this.field1422[3] = 1.0f;
        this.field1423.clear();
        this.field1424.clear();
        this.field1425.clear();
        this.field1426.clear();
        this.field1417.clear();
    }
    
    void ck(final JSONObject jsonObject) throws JSONException {
        final String[] names = JSONObject.getNames(jsonObject);
        for (int i = 0; i < jsonObject.length(); ++i) {
            try {
                this.field1426.put(names[i], jsonObject.getInt(names[i]));
            }
            catch (Exception ex) {
                try {
                    final String string = jsonObject.getString(names[i]);
                    if (string.equals("true")) {
                        this.field1426.put(names[i], 1);
                    }
                    else if (string.equals("false")) {
                        this.field1426.put(names[i], 0);
                    }
                    else {
                        this.field1417.put(names[i], string);
                    }
                }
                catch (Exception ex2) {}
            }
        }
    }
    
    public ArrayList bo() {
        return this.field1424;
    }
    
    void bp() {
        for (final class172 class172 : this.field1424) {
            if (class172.field1445 != null && !class172.field1445.isDone((byte)(-123))) {
                return;
            }
        }
        for (final class172 class173 : this.field1424) {
            if (null != class173.field1445) {
                final byte[] response = class173.field1445.getResponse((byte)(-86));
                if (null != response && response.length > 0) {
                    this.field1419 = 177072694;
                    return;
                }
                continue;
            }
        }
        sg(this, 1872103371);
        this.field1419 = 352236455;
    }
    
    void cc(final JSONArray jsonArray) throws JSONException {
        if (jsonArray == null) {
            return;
        }
        for (int i = 0; i < jsonArray.length(); ++i) {
            final JSONObject jsonObject = jsonArray.getJSONObject(i);
            final class173 e = new class173(this);
            e.field1447 = jsonObject.getString("text");
            final class173 class173 = e;
            final String string = jsonObject.getString("align_x");
            int n;
            if (string.equals("centre")) {
                n = 1;
            }
            else if (string.equals("bottom") || string.equals("right")) {
                n = 2;
            }
            else {
                n = 0;
            }
            class173.field1449 = n * 1031801969;
            final class173 class174 = e;
            final String string2 = jsonObject.getString("align_y");
            int n2;
            if (string2.equals("centre")) {
                n2 = 1;
            }
            else if (!string2.equals("bottom") && !string2.equals("right")) {
                n2 = 0;
            }
            else {
                n2 = 2;
            }
            class174.field1450 = -1546372192 * n2;
            e.field1446 = jsonObject.getInt("font") * 1791031327;
            e.field1448 = UserComparator8.method686(jsonObject, "placement", 49783644);
            this.field1425.add(e);
        }
    }
    
    public ArrayList bt() {
        return this.field1425;
    }
    
    void bc() {
        for (final class172 class172 : this.field1424) {
            if (class172.field1445 != null && !class172.field1445.isDone((byte)103)) {
                return;
            }
        }
        for (final class172 class173 : this.field1424) {
            if (null != class173.field1445) {
                final byte[] response = class173.field1445.getResponse((byte)(-31));
                if (null != response && response.length > 0) {
                    this.field1419 = 177072694;
                    return;
                }
                continue;
            }
        }
        sg(this, 1946758697);
        this.field1419 = 352236455;
    }
    
    public String br() {
        return this.field1420;
    }
    
    public static boolean nu(final class166 class166, final String field1421, final UrlRequester urlRequester, final int n) {
        if (class166 == null) {
            return class166.method924(field1421, urlRequester, n);
        }
        try {
            if (field1421 != null) {
                if (n >= 1232835614) {
                    throw new IllegalStateException();
                }
                if (!field1421.isEmpty()) {
                    if (urlRequester == null) {
                        if (n >= 1232835614) {
                            throw new IllegalStateException();
                        }
                        return false;
                    }
                    else {
                        sg(class166, 1010078609);
                        try {
                            class166.field1421 = field1421;
                            class166.field1418 = urlRequester.request(new URL(class166.field1421), -922022252);
                            class166.field1419 = 0;
                            return true;
                        }
                        catch (MalformedURLException ex2) {
                            sg(class166, -498090425);
                            class166.field1419 = 263700108;
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.af(" + ')');
        }
    }
    
    void ci(final JSONArray jsonArray) throws JSONException {
        if (jsonArray == null) {
            return;
        }
        for (int i = 0; i < jsonArray.length(); ++i) {
            final JSONObject jsonObject = jsonArray.getJSONObject(i);
            final class173 e = new class173(this);
            e.field1447 = jsonObject.getString("text");
            final class173 class173 = e;
            final String string = jsonObject.getString("align_x");
            int n;
            if (string.equals("centre")) {
                n = 1;
            }
            else if (!string.equals("bottom") && !string.equals("right")) {
                n = 0;
            }
            else {
                n = 2;
            }
            class173.field1449 = n * -663309687;
            final class173 class174 = e;
            final String string2 = jsonObject.getString("align_y");
            int n2;
            if (string2.equals("centre")) {
                n2 = 1;
            }
            else if (!string2.equals("bottom") && !string2.equals("right")) {
                n2 = 0;
            }
            else {
                n2 = 2;
            }
            class174.field1450 = 1437150123 * n2;
            e.field1446 = jsonObject.getInt("font") * -1157447435;
            e.field1448 = UserComparator8.method686(jsonObject, "placement", -1773994363);
            this.field1425.add(e);
        }
    }
    
    public int method926(final byte b) {
        try {
            return 371416339 * this.field1419;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.aw(" + ')');
        }
    }
    
    public boolean method938(final String s, final UrlRequester urlRequester, final int n) {
        try {
            try {
                this.method937(new class437(s.getBytes()), urlRequester, 251673402);
                int n2;
                if (this.field1425.size() > 0) {
                    if (n >= 791915096) {
                        throw new IllegalStateException();
                    }
                    n2 = 1;
                }
                else {
                    n2 = 2;
                }
                this.field1419 = n2 * 88536347;
            }
            catch (UnsupportedEncodingException ex2) {
                this.field1419 = 440772802;
            }
            boolean b;
            if (371416339 * this.field1419 < 100) {
                if (n >= 791915096) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.am(" + ')');
        }
    }
    
    public String method940(final byte b) {
        try {
            return this.field1420;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.al(" + ')');
        }
    }
    
    public void method925(final UrlRequester urlRequester, final byte b) {
        try {
            switch (this.field1419 * 371416339) {
                default: {}
                case 0: {
                    this.method943(urlRequester, -724612758);
                    break;
                }
                case 1: {
                    this.method928(155422894);
                    break;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.an(" + ')');
        }
    }
    
    public int method933(final String s, final byte b) {
        try {
            int intValue;
            if (this.field1426.containsKey(s)) {
                if (b == 7) {
                    throw new IllegalStateException();
                }
                intValue = this.field1426.get(s);
            }
            else {
                intValue = -1;
            }
            return intValue;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.ac(" + ')');
        }
    }
    
    static final void method944(final Widget widget, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final byte b) {
        try {
            if (Client.field437) {
                if (b == 0) {
                    return;
                }
                Client.alternativeScrollbarWidth = 1151731872;
            }
            else {
                Client.alternativeScrollbarWidth = 0;
            }
            Client.field437 = false;
            Label_0471: {
                if (114417019 * MouseHandler.MouseHandler_currentButton != 1) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    if (class473.mouseCam) {
                        break Label_0471;
                    }
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    if (114417019 * MouseHandler.MouseHandler_currentButton != 4) {
                        break Label_0471;
                    }
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                }
                if (n5 >= n && n5 < n + 16) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    if (n6 >= n2) {
                        if (b == 0) {
                            throw new IllegalStateException();
                        }
                        if (n6 < 16 + n2) {
                            if (b == 0) {
                                throw new IllegalStateException();
                            }
                            widget.scrollY += 510215044;
                            class144.invalidateWidget(widget, -1249122622);
                            break Label_0471;
                        }
                    }
                }
                if (n5 >= n) {
                    if (b == 0) {
                        return;
                    }
                    if (n5 < 16 + n) {
                        if (b == 0) {
                            throw new IllegalStateException();
                        }
                        if (n6 >= n3 + n2 - 16) {
                            if (b == 0) {
                                throw new IllegalStateException();
                            }
                            if (n6 < n3 + n2) {
                                widget.scrollY -= 510215044;
                                class144.invalidateWidget(widget, -1623095806);
                                break Label_0471;
                            }
                        }
                    }
                }
                if (n5 >= n - Client.alternativeScrollbarWidth * -1434295667) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    if (n5 < -1434295667 * Client.alternativeScrollbarWidth + (16 + n)) {
                        if (b == 0) {
                            throw new IllegalStateException();
                        }
                        if (n6 >= n2 + 16) {
                            if (b == 0) {
                                return;
                            }
                            if (n6 < n2 + n3 - 16) {
                                if (b == 0) {
                                    throw new IllegalStateException();
                                }
                                int n7 = (n3 - 32) * n3 / n4;
                                if (n7 < 8) {
                                    if (b == 0) {
                                        return;
                                    }
                                    n7 = 8;
                                }
                                widget.scrollY = 946188063 * ((n6 - n2 - 16 - n7 / 2) * (n4 - n3) / (n3 - 32 - n7));
                                class144.invalidateWidget(widget, -2101559690);
                                Client.field437 = true;
                            }
                        }
                    }
                }
            }
            if (-121753353 * Client.mouseWheelRotation != 0) {
                if (b == 0) {
                    return;
                }
                if (n5 >= n - widget.width * -794961409) {
                    if (b == 0) {
                        return;
                    }
                    if (n6 >= n2) {
                        if (b == 0) {
                            throw new IllegalStateException();
                        }
                        if (n5 < 16 + n) {
                            if (b == 0) {
                                throw new IllegalStateException();
                            }
                            if (n6 <= n3 + n2) {
                                if (b == 0) {
                                    throw new IllegalStateException();
                                }
                                widget.scrollY += Client.mouseWheelRotation * -908462347;
                                class144.invalidateWidget(widget, -1465589258);
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.ll(" + ')');
        }
    }
    
    public String method927(final String s, final byte b) {
        try {
            String value;
            if (this.field1417.containsKey(s)) {
                if (b == 4) {
                    throw new IllegalStateException();
                }
                value = this.field1417.get(s);
            }
            else {
                value = null;
            }
            return value;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.au(" + ')');
        }
    }
    
    public static void method931(final class166 class166, final JSONArray jsonArray) throws JSONException {
        if (class166 == null) {
            class166.bu();
        }
        if (jsonArray == null) {
            return;
        }
        for (int i = 0; i < jsonArray.length(); ++i) {
            final JSONObject jsonObject = jsonArray.getJSONObject(i);
            final class173 e = new class173(class166);
            e.field1447 = jsonObject.getString("text");
            final class173 class167 = e;
            final String string = jsonObject.getString("align_x");
            int n;
            if (string.equals("centre")) {
                n = 1;
            }
            else if (!string.equals("bottom") && !string.equals("right")) {
                n = 0;
            }
            else {
                n = 2;
            }
            class167.field1449 = n * -663309687;
            final class173 class168 = e;
            final String string2 = jsonObject.getString("align_y");
            int n2;
            if (string2.equals("centre")) {
                n2 = 1;
            }
            else if (!string2.equals("bottom") && !string2.equals("right")) {
                n2 = 0;
            }
            else {
                n2 = 2;
            }
            class168.field1450 = 339252410 * n2;
            e.field1446 = jsonObject.getInt("font") * -1157447435;
            e.field1448 = UserComparator8.method686(jsonObject, "placement", -1698426124);
            class166.field1425.add(e);
        }
    }
    
    public ArrayList method931(final int n) {
        try {
            return this.field1423;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.aa(" + ')');
        }
    }
    
    void method934(final JSONArray jsonArray, final UrlRequester urlRequester, final int n) throws JSONException {
        try {
            if (jsonArray != null) {
                for (int i = 0; i < jsonArray.length(); ++i) {
                    if (n != 2041464667) {
                        throw new IllegalStateException();
                    }
                    try {
                        final JSONObject jsonObject = jsonArray.getJSONObject(i);
                        final class172 e = new class172(this);
                        e.field1445 = urlRequester.request(new URL(jsonObject.getString("src")), -1693908057);
                        e.field1444 = UserComparator8.method686(jsonObject, "placement", -1286212275);
                        this.field1424.add(e);
                    }
                    catch (MalformedURLException ex2) {}
                }
                return;
            }
            if (n != 2041464667) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.ai(" + ')');
        }
    }
    
    void bh(final JSONArray jsonArray, final UrlRequester urlRequester) throws JSONException {
        if (jsonArray == null) {
            return;
        }
        for (int i = 0; i < jsonArray.length(); ++i) {
            try {
                final JSONObject jsonObject = jsonArray.getJSONObject(i);
                final class172 e = new class172(this);
                e.field1445 = urlRequester.request(new URL(jsonObject.getString("src")), -560975224);
                e.field1444 = UserComparator8.method686(jsonObject, "placement", -1399440588);
                this.field1424.add(e);
            }
            catch (MalformedURLException ex) {}
        }
    }
    
    public String bx(final String s) {
        return this.field1417.containsKey(s) ? this.field1417.get(s) : null;
    }
    
    void method937(final class437 class437, final UrlRequester urlRequester, final int n) {
        try {
            JSONObject jsonObject;
            try {
                jsonObject = class437.hj(class437, -288365426).getJSONObject("message");
            }
            catch (Exception ex2) {
                sg(this, 1386264480);
                this.field1419 = 440772802;
                return;
            }
            try {
                this.method934(jsonObject.getJSONArray("images"), urlRequester, 2041464667);
            }
            catch (Exception ex3) {
                this.field1424.clear();
            }
            try {
                this.method935(jsonObject.getJSONArray("labels"), (byte)3);
            }
            catch (Exception ex4) {
                this.field1425.clear();
            }
            try {
                this.method936(jsonObject.getJSONObject("behaviour"), -28927295);
            }
            catch (Exception ex5) {
                this.field1420 = null;
                this.field1422[0] = 0.0f;
                this.field1422[1] = 0.0f;
                this.field1422[2] = 1.0f;
                this.field1422[3] = 1.0f;
                this.field1423.clear();
            }
            try {
                this.method941(jsonObject.getJSONObject("meta"), 891662681);
            }
            catch (Exception ex6) {
                this.field1426.clear();
                this.field1417.clear();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.ar(" + ')');
        }
    }
    
    public void ap(final UrlRequester urlRequester) {
        switch (this.field1419 * 422831862) {
            case 1: {
                this.method928(-1092159315);
                break;
            }
            default: {}
            case 0: {
                this.method943(urlRequester, 1570712310);
                break;
            }
        }
    }
    
    public ArrayList bd() {
        return this.field1425;
    }
    
    public static void qr(final class166 class166, final UrlRequester urlRequester, final byte b) {
        if (class166 == null) {
            class166.method925(urlRequester, b);
            return;
        }
        try {
            switch (class166.field1419 * 371416339) {
                default: {}
                case 0: {
                    class166.method943(urlRequester, -724612758);
                    break;
                }
                case 1: {
                    class166.method928(155422894);
                    break;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.an(" + ')');
        }
    }
    
    static float[] cg(final JSONObject jsonObject, final String s) throws JSONException {
        final float[] array = new float[4];
        try {
            final JSONArray jsonArray = jsonObject.getJSONArray(s);
            array[0] = (float)jsonArray.optDouble(0, 0.0);
            array[1] = (float)jsonArray.optDouble(1, 0.0);
            array[2] = (float)jsonArray.optDouble(2, 1.0);
            array[3] = (float)jsonArray.optDouble(3, 1.0);
        }
        catch (JSONException ex) {
            array[1] = (array[0] = 0.0f);
            array[3] = (array[2] = 1.0f);
        }
        return array;
    }
    
    public static void sg(final class166 class166, final int n) {
        if (class166 == null) {
            class166.method932(n);
        }
        try {
            class166.field1418 = null;
            class166.field1420 = null;
            class166.field1422[0] = 0.0f;
            class166.field1422[1] = 0.0f;
            class166.field1422[2] = 1.0f;
            class166.field1422[3] = 1.0f;
            class166.field1423.clear();
            class166.field1424.clear();
            class166.field1425.clear();
            class166.field1426.clear();
            class166.field1417.clear();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.ay(" + ')');
        }
    }
    
    public static boolean la(final class166 class166, final String s, final UrlRequester urlRequester, final int n) {
        Label_0012: {
            if (class166 != null) {
                break Label_0012;
            }
            class166.method938(s, urlRequester, n);
            try {
                try {
                    class166.method937(new class437(s.getBytes()), urlRequester, 251673402);
                    int n2;
                    if (class166.field1424.size() > 0) {
                        if (n >= 791915096) {
                            throw new IllegalStateException();
                        }
                        n2 = 1;
                    }
                    else {
                        n2 = 2;
                    }
                    class166.field1419 = n2 * 88536347;
                }
                catch (UnsupportedEncodingException ex2) {
                    class166.field1419 = 440772802;
                }
                boolean b;
                if (371416339 * class166.field1419 < 100) {
                    if (n >= 791915096) {
                        throw new IllegalStateException();
                    }
                    b = true;
                }
                else {
                    b = false;
                }
                return b;
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "gy.am(" + ')');
            }
        }
    }
    
    public boolean method924(final String field1421, final UrlRequester urlRequester, final int n) {
        try {
            if (field1421 != null) {
                if (n >= 1232835614) {
                    throw new IllegalStateException();
                }
                if (!field1421.isEmpty()) {
                    if (urlRequester == null) {
                        if (n >= 1232835614) {
                            throw new IllegalStateException();
                        }
                        return false;
                    }
                    else {
                        sg(this, 1010078609);
                        try {
                            this.field1421 = field1421;
                            this.field1418 = urlRequester.request(new URL(this.field1421), -922022252);
                            this.field1419 = 0;
                            return true;
                        }
                        catch (MalformedURLException ex2) {
                            sg(this, -498090425);
                            this.field1419 = 263700108;
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.af(" + ')');
        }
    }
    
    public String bn() {
        return this.field1420;
    }
    
    public ArrayList method929(final int n) {
        try {
            return this.field1424;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.ab(" + ')');
        }
    }
    
    static void Widget_runOnTargetLeave(final byte b) {
        try {
            if (Client.isSpellSelected) {
                final Widget widgetChild = SoundSystem.getWidgetChild(96656415 * Clips.selectedSpellWidget, 145251849 * Client.selectedSpellChildIndex, -1271528922);
                if (widgetChild != null) {
                    if (b <= 1) {
                        throw new IllegalStateException();
                    }
                    if (null != widgetChild.onTargetLeave) {
                        if (b <= 1) {
                            throw new IllegalStateException();
                        }
                        final ScriptEvent scriptEvent = new ScriptEvent();
                        scriptEvent.dragTarget = widgetChild;
                        scriptEvent.args = widgetChild.onTargetLeave;
                        HealthBarUpdate.set(scriptEvent, (byte)61);
                    }
                }
                Client.selectedSpellItemId = -35668549;
                Client.isSpellSelected = false;
                class144.invalidateWidget(widgetChild, -847721052);
                return;
            }
            if (b <= 1) {
                return;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.kp(" + ')');
        }
    }
    
    public ArrayList method942(final byte b) {
        try {
            return this.field1425;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.aq(" + ')');
        }
    }
    
    public boolean aj(final String field1420, final UrlRequester urlRequester) {
        if (field1420 == null || field1420.isEmpty()) {
            return false;
        }
        if (urlRequester == null) {
            return false;
        }
        sg(this, 139483934);
        try {
            this.field1420 = field1420;
            this.field1418 = urlRequester.request(new URL(this.field1420), -360431137);
            this.field1419 = 0;
            return true;
        }
        catch (MalformedURLException ex) {
            sg(this, 479745345);
            this.field1419 = 263700108;
            return false;
        }
    }
    
    void method935(final JSONArray jsonArray, final byte b) throws JSONException {
        try {
            if (jsonArray != null) {
                for (int i = 0; i < jsonArray.length(); ++i) {
                    if (b != 3) {
                        throw new IllegalStateException();
                    }
                    final JSONObject jsonObject = jsonArray.getJSONObject(i);
                    final class173 e = new class173(this);
                    e.field1447 = jsonObject.getString("text");
                    final class173 class173 = e;
                    final String string = jsonObject.getString("align_x");
                    int n = 0;
                    Label_0263: {
                        if (string.equals("centre")) {
                            if (b != 3) {
                                throw new IllegalStateException();
                            }
                            n = 1;
                        }
                        else {
                            if (!string.equals("bottom")) {
                                if (b != 3) {
                                    throw new IllegalStateException();
                                }
                                if (!string.equals("right")) {
                                    n = 0;
                                    break Label_0263;
                                }
                                if (b != 3) {
                                    return;
                                }
                            }
                            n = 2;
                        }
                    }
                    class173.field1449 = n * -663309687;
                    final class173 class174 = e;
                    final String string2 = jsonObject.getString("align_y");
                    int n2 = 0;
                    Label_0279: {
                        if (string2.equals("centre")) {
                            n2 = 1;
                        }
                        else {
                            if (!string2.equals("bottom")) {
                                if (b != 3) {
                                    throw new IllegalStateException();
                                }
                                if (!string2.equals("right")) {
                                    n2 = 0;
                                    break Label_0279;
                                }
                            }
                            n2 = 2;
                        }
                    }
                    class174.field1450 = 1437150123 * n2;
                    e.field1446 = jsonObject.getInt("font") * -1157447435;
                    e.field1448 = UserComparator8.method686(jsonObject, "placement", -2112078518);
                    this.field1425.add(e);
                }
                return;
            }
            if (b != 3) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.ag(" + ')');
        }
    }
    
    void bl() {
        for (final class172 class172 : this.field1424) {
            if (class172.field1445 != null && !class172.field1445.isDone((byte)20)) {
                return;
            }
        }
        for (final class172 class173 : this.field1424) {
            if (null != class173.field1445) {
                final byte[] response = class173.field1445.getResponse((byte)28);
                if (null != response && response.length > 0) {
                    this.field1419 = 177072694;
                    return;
                }
                continue;
            }
        }
        sg(this, 422690371);
        this.field1419 = 352236455;
    }
    
    public String bj() {
        return this.field1420;
    }
    
    public static String ya(final class166 class166, final String s, final byte b) {
        if (class166 == null) {
            class166.method927(s, b);
        }
        try {
            String value;
            if (class166.field1417.containsKey(s)) {
                if (b == 4) {
                    throw new IllegalStateException();
                }
                value = class166.field1417.get(s);
            }
            else {
                value = null;
            }
            return value;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.au(" + ')');
        }
    }
    
    void cq(final JSONObject jsonObject) throws JSONException {
        final String[] names = JSONObject.getNames(jsonObject);
        for (int i = 0; i < jsonObject.length(); ++i) {
            try {
                this.field1426.put(names[i], jsonObject.getInt(names[i]));
            }
            catch (Exception ex) {
                try {
                    final String string = jsonObject.getString(names[i]);
                    if (string.equals("true")) {
                        this.field1426.put(names[i], 1);
                    }
                    else if (string.equals("false")) {
                        this.field1426.put(names[i], 0);
                    }
                    else {
                        this.field1417.put(names[i], string);
                    }
                }
                catch (Exception ex2) {}
            }
        }
    }
    
    public ArrayList bm() {
        return this.field1424;
    }
    
    public int bk(final String s) {
        return this.field1426.containsKey(s) ? this.field1426.get(s) : -1;
    }
    
    void method936(final JSONObject jsonObject, final int n) throws JSONException {
        try {
            if (null != jsonObject) {
                this.field1422 = UserComparator8.method686(jsonObject, "clickbounds", -662115425);
                this.field1420 = jsonObject.getString("endpoint");
                final String[] names = JSONObject.getNames(jsonObject);
                for (int i = 0; i < jsonObject.length(); ++i) {
                    if (n != -28927295) {
                        throw new IllegalStateException();
                    }
                    if (!names[i].equals("clickbounds")) {
                        if (n != -28927295) {
                            return;
                        }
                        if (!names[i].equals("endpoint")) {
                            if (n != -28927295) {
                                throw new IllegalStateException();
                            }
                            try {
                                this.field1423.add(new class174(this, names[i], jsonObject.getInt(names[i])));
                            }
                            catch (Exception ex2) {
                                try {
                                    final String string = jsonObject.getString(names[i]);
                                    if (string.equals("true")) {
                                        this.field1423.add(new class174(this, names[i], 1));
                                    }
                                    else if (string.equals("false")) {
                                        if (n != -28927295) {
                                            throw new IllegalStateException();
                                        }
                                        this.field1423.add(new class174(this, names[i], 0));
                                    }
                                    else {
                                        this.field1423.add(new class165(this, names[i], string));
                                    }
                                }
                                catch (Exception ex3) {}
                            }
                        }
                    }
                }
                return;
            }
            if (n != -28927295) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gy.ah(" + ')');
        }
    }
    
    public static boolean ig(final class166 class166, final String field1421, final UrlRequester urlRequester) {
        if (class166 == null) {
            class166.aj(field1421, urlRequester);
        }
        if (field1421 == null || field1421.isEmpty()) {
            return false;
        }
        if (urlRequester == null) {
            return false;
        }
        sg(class166, 139483934);
        try {
            class166.field1421 = field1421;
            class166.field1418 = urlRequester.request(new URL(class166.field1421), -360431137);
            class166.field1419 = 0;
            return true;
        }
        catch (MalformedURLException ex) {
            sg(class166, 479745345);
            class166.field1419 = 263700108;
            return false;
        }
    }
    
    public static void qx(final class166 class166, final JSONObject jsonObject) throws JSONException {
        if (class166 == null) {
            class166.bn();
        }
        final String[] names = JSONObject.getNames(jsonObject);
        for (int i = 0; i < jsonObject.length(); ++i) {
            try {
                class166.field1426.put(names[i], jsonObject.getInt(names[i]));
            }
            catch (Exception ex) {
                try {
                    final String string = jsonObject.getString(names[i]);
                    if (string.equals("true")) {
                        class166.field1426.put(names[i], 1);
                    }
                    else if (string.equals("false")) {
                        class166.field1426.put(names[i], 0);
                    }
                    else {
                        class166.field1417.put(names[i], string);
                    }
                }
                catch (Exception ex2) {}
            }
        }
    }
    
    public ArrayList bf() {
        return this.field1423;
    }
    
    public float[] bu() {
        return this.field1422;
    }
}
