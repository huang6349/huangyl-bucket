package org.hyl.bucket.commons.result;

import org.assertj.core.api.Assertions;
import org.hyl.bucket.commons.result.domain.Message;
import org.hyl.bucket.commons.result.enums.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class ResultUtilTest {

    private Integer state;

    private String message;

    private List<Integer> data;

    private String e;

    private Map<String, Integer> params;

    @Before
    public void setUp() throws Exception {
        this.state = new Random().nextInt(400) + 100;
        this.message = "TEST";
        this.data = new ArrayList<>();
        this.data.add(new Random().nextInt());
        this.data.add(new Random().nextInt());
        this.data.add(new Random().nextInt());
        this.e = new RuntimeException("ERROR").getMessage();
        this.params = new HashMap<>();
        this.params.put("id", new Random().nextInt(100));
    }

    @Test
    public void success0() throws Exception {
        Message a = new Message();
        a.setState(Result.SUCCESS.getState());
        a.setMessage(Result.SUCCESS.getMessage());
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        compare(a, ResultUtil.success());
    }

    @Test
    public void success1() throws Exception {
        Message a = new Message();
        a.setState(state);
        a.setMessage(Result.SUCCESS.getMessage());
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        compare(a, ResultUtil.success(state));
    }

    @Test
    public void success2() throws Exception {
        Message a = new Message();
        a.setState(state);
        a.setMessage(message);
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        compare(a, ResultUtil.success(state, message));
    }

    @Test
    public void success3() throws Exception {
        Message a = new Message();
        a.setState(state);
        a.setMessage(message);
        a.setData(data);
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        compare(a, ResultUtil.success(state, message, data));
    }

    @Test
    public void success4() throws Exception {
        Message a = new Message();
        a.setState(state);
        a.setMessage(message);
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, ResultUtil.success(state, message, data, params));
    }

    @Test
    public void success5() throws Exception {
        Message a = new Message();
        a.setState(state);
        a.setMessage(Result.SUCCESS.getMessage());
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        a.setData(data);
        compare(a, ResultUtil.success(state, data));
    }

    @Test
    public void success6() throws Exception {
        Message a = new Message();
        a.setState(state);
        a.setMessage(Result.SUCCESS.getMessage());
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, ResultUtil.success(state, data, params));
    }

    @Test
    public void success7() throws Exception {
        Message a = new Message();
        a.setState(Result.SUCCESS.getState());
        a.setMessage(message);
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        compare(a, ResultUtil.success(message));
    }

    @Test
    public void success8() throws Exception {
        Message a = new Message();
        a.setState(Result.SUCCESS.getState());
        a.setMessage(message);
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        a.setData(data);
        compare(a, ResultUtil.success(message, data));
    }

    @Test
    public void success9() throws Exception {
        Message a = new Message();
        a.setState(Result.SUCCESS.getState());
        a.setMessage(message);
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, ResultUtil.success(message, data, params));
    }

    @Test
    public void success10() throws Exception {
        Message a = new Message();
        a.setState(Result.SUCCESS.getState());
        a.setMessage(Result.SUCCESS.getMessage());
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        a.setData(data);
        compare(a, ResultUtil.success(data));
    }

    @Test
    public void success11() throws Exception {
        Message a = new Message();
        a.setState(Result.SUCCESS.getState());
        a.setMessage(Result.SUCCESS.getMessage());
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, ResultUtil.success(data, params));
    }

    @Test
    public void error0() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(Result.ERROR.getState());
        a.setMessage(Result.ERROR.getMessage());
        a.setSuccess(Result.Network.ERROR.isSuccess());
        compare(a, ResultUtil.error(e));
    }

    @Test
    public void error1() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(state);
        a.setMessage(Result.ERROR.getMessage());
        a.setSuccess(Result.Network.ERROR.isSuccess());
        compare(a, ResultUtil.error(e, state));
    }

    @Test
    public void error2() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(state);
        a.setMessage(message);
        a.setSuccess(Result.Network.ERROR.isSuccess());
        compare(a, ResultUtil.error(e, state, message));
    }

    @Test
    public void error3() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(state);
        a.setMessage(message);
        a.setSuccess(Result.Network.ERROR.isSuccess());
        a.setData(data);
        compare(a, ResultUtil.error(e, state, message, data));
    }

    @Test
    public void error4() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(state);
        a.setMessage(message);
        a.setSuccess(Result.Network.ERROR.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, ResultUtil.error(e, state, message, data, params));
    }

    @Test
    public void error5() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(state);
        a.setMessage(Result.ERROR.getMessage());
        a.setSuccess(Result.Network.ERROR.isSuccess());
        a.setData(data);
        compare(a, ResultUtil.error(e, state, data));
    }

    @Test
    public void error6() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(state);
        a.setMessage(Result.ERROR.getMessage());
        a.setSuccess(Result.Network.ERROR.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, ResultUtil.error(e, state, data, params));
    }

    @Test
    public void error7() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(Result.ERROR.getState());
        a.setMessage(message);
        a.setSuccess(Result.Network.ERROR.isSuccess());
        compare(a, ResultUtil.error(e, message));
    }

    @Test
    public void error8() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(Result.ERROR.getState());
        a.setMessage(message);
        a.setSuccess(Result.Network.ERROR.isSuccess());
        a.setData(data);
        compare(a, ResultUtil.error(e, message, data));
    }

    @Test
    public void error9() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(Result.ERROR.getState());
        a.setMessage(message);
        a.setSuccess(Result.Network.ERROR.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, ResultUtil.error(e, message, data, params));
    }

    @Test
    public void error10() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(Result.ERROR.getState());
        a.setMessage(Result.ERROR.getMessage());
        a.setSuccess(Result.Network.ERROR.isSuccess());
        a.setData(data);
        compare(a, ResultUtil.error(e, data));
    }

    @Test
    public void error11() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(Result.ERROR.getState());
        a.setMessage(Result.ERROR.getMessage());
        a.setSuccess(Result.Network.ERROR.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, ResultUtil.error(e, data, params));
    }

    private void compare(Message a, Message b) throws Exception {
        Assertions.assertThat(a.getState()).isEqualTo(b.getState());
        Assertions.assertThat(a.getMessage()).isEqualTo(b.getMessage());
        Assertions.assertThat(a.getData()).isEqualTo(b.getData());
        Assertions.assertThat(a.getSuccess()).isEqualTo(b.getSuccess());
        Assertions.assertThat(a.getE()).isEqualTo(b.getE());
        Assertions.assertThat(a.getParams()).isEqualTo(b.getParams());
    }
}
