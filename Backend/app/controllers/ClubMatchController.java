package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import entities.FootballClub;
import entities.Match;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;
import services.Service;
import utils.ApplicationUtil;

import java.io.IOException;
import java.util.ArrayList;

import static play.mvc.Results.*;

public class ClubMatchController {

    public Result getClubs() throws IOException {
        ArrayList<FootballClub> result = Service.getInstance().getClub();
        ObjectMapper map = new ObjectMapper();

        JsonNode data = map.convertValue(result,JsonNode.class);
        return ok(data);
    }

    public Result getMatches() throws IOException {
        ArrayList<Match> result = Service.getInstance().getMatch();
        ObjectMapper map = new ObjectMapper();

        JsonNode data = map.convertValue(result,JsonNode.class);
        return ok(data);
    }

    public Result getClubs2() throws IOException {
        ArrayList<FootballClub> result = Service.getInstance().getClub2();
        ObjectMapper map = new ObjectMapper();

        JsonNode data = map.convertValue(result,JsonNode.class);
        return ok(data);
    }

    public Result getClubs3() throws IOException {
        ArrayList<FootballClub> result = Service.getInstance().getClub3();
        ObjectMapper map = new ObjectMapper();

        JsonNode data = map.convertValue(result,JsonNode.class);
        return ok(data);
    }


//    public Result createMatch() throws IOException {
//
//        JsonNode json = request().body().asJson();
//        if (json == null) {
//            return badRequest(ApplicationUtil.createResponse("Expecting JSON data", false));
//        }
//        Match match = Service.getInstance().addMatch(Json.fromJson(json, Match.class));
//        JsonNode jsonObject = Json.toJson(match);
//        return created(ApplicationUtil.createResponse(jsonObject, true));
//    }



}

