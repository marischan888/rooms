```mermaid
  graph TD
    user(["user"]):::act
    enter_panel(["enter panel"]):::cmd
    panel(["panel"]):::agg
    entered_panel(["entered panel"]):::doe
    panel_ui(["panel ui"]):::rm
    
    user --> enter_panel --> panel --> entered_panel --> panel_ui
    
    select_theme(["select theme"]):::cmd
    theme(["theme"]):::agg
    theme_selected(["theme selected"]):::doe
    make_record(["record the selected theme"]):::pro
    user_record(["user record"]):::agg
    record_updated(["user record updated"]):::doe
    update_recent(["update recent playlist"]):::pro
    display_recent(["display recent music"]):::cmd
    recent_display(["recent play display"]):::doe
    recent_history(["recent history ui"]):::rm
    update_pop(["update popular theme"]):::pro
    daily_pop(["display the daily  top 10 popular music"]):::cmd
    find_pop(["the daily top 10 display"]):::doe
    pop_ui(["Top 10 popular music"]):::rm
    
    user --> select_theme --> theme --> theme_selected --> make_record --> user_record -->record_updated --> 
    update_pop & update_recent --> display_recent & daily_pop --> user_record --> recent_display & find_pop --> 
pop_ui & recent_history
    
    theme_room(["room"]):::rm
    theme_selected --> theme_room
    
    stop_music(["stop the music"]):::cmd
    music_stopped(["music stopped"]):::doe
    resume_music(["resume the music"]):::cmd
    music_resumed(["music resumed"]):::doe
    user --> stop_music --> theme --> music_stopped
    user --> resume_music --> theme --> music_resumed
    
    exit_room(["exit room"]):::cmd
    default_ui(["default room"]):::rm
    
    user --> exit_room --> default_ui
    
    search_theme(["search theme"]):::cmd
    theme_found(["theme found"]):::doe
    user --> search_them --> theme --> theme_found
    
%% a(["Domain Event"]):::doe
%% b(["Command"]):::cmd
%% c(["External System"]):::ext
%% d(["Policy Process"]):::pro
%% e(["Read Model"]):::rm
%% f(["Hotspot Issue"]):::hot
%% g(["Aggregate"]):::agg

%% Domain Event
    classDef doe fill:#d55e00,color:#000000;
%% Command
    classDef cmd fill:#a5d8ff,color:#000000;
%% External System
    classDef ext fill:#cc79a7,color:#000000;
%% Policy Process
    classDef pro fill:#d0bfff,color:#000000;
%% Read Model
    classDef rm  fill:#009e73,color:#000000;
%% Hotspot Issue
    classDef hot fill:#fa5252,color:#000000;
%% Aggregate
    classDef agg fill:#e69f00,color:#000000;
%% Actor
    classDef act fill:#f0e442,color:#000000;
```
# Phase 1
## Panel
User open the theme panel\
User select the theme\
User stop the music\
User leave the theme\
User search the theme\
User can know the current popular theme
## Recent Play
User can enter the recent play list
## Daily popular
User can see the daily popular in their location
# Phase 2 
## Auth
User log in or sign up\
User enter the default room
# Phase 3 
## AI recommendation 
1. Global AI model will recommend based on the user play list
2. Global AI model will recommend based on the user description 
3. Global AI model will recommend based on the local weather 