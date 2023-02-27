package ogtexturetool;

import imgui.ImGui;
import imgui.app.Application;
import imgui.app.Color;
import imgui.app.Configuration;
import imgui.flag.ImGuiCol;
import imgui.flag.ImGuiCond;
import imgui.flag.ImGuiStyleVar;
import imgui.type.ImInt;

public class App extends Application {

    public final Color titlebar_color = new Color(0.15f, 0.15f, 0.15f, 0.98f);
    public final Color background_color = new Color(0.25f, 0.25f, 0.25f, 0.98f);
    public final Color text_color = new Color(0.7f, 0.7f, 0.7f, 1.0f);
    public final Color item_hovered = new Color(0.2f, 0.2f, 0.2f, 0.98f);
    public final Color item_clicked = new Color(0.1f, 0.1f, 0.1f, 0.98f);
    
    @Override
    protected void configure(Configuration config) {
        config.setTitle("OG Texture Tool");
    }

    @Override
    protected void initImGui(final Configuration config) {
        ImGui.createContext();

        ImGui.pushStyleVar(ImGuiStyleVar.WindowMinSize, 350.0f, 350.0f);
        ImGui.pushStyleVar(ImGuiStyleVar.WindowRounding, 5.0f);
        
        ImGui.pushStyleColor(ImGuiCol.WindowBg, background_color.getRed(), background_color.getGreen(), background_color.getBlue(), background_color.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.PopupBg, background_color.getRed(), background_color.getGreen(), background_color.getBlue(), background_color.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.TitleBg, background_color.getRed(), background_color.getGreen(), background_color.getBlue(), background_color.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.TitleBgCollapsed, background_color.getRed(), background_color.getGreen(), background_color.getBlue(), background_color.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.ScrollbarBg, background_color.getRed(), background_color.getGreen(), background_color.getBlue(), background_color.getAlpha());
        
        ImGui.pushStyleColor(ImGuiCol.TitleBgActive, titlebar_color.getRed(), titlebar_color.getGreen(), titlebar_color.getBlue(), titlebar_color.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.MenuBarBg, titlebar_color.getRed(), titlebar_color.getGreen(), titlebar_color.getBlue(), titlebar_color.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.Header, titlebar_color.getRed(), titlebar_color.getGreen(), titlebar_color.getBlue(), titlebar_color.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.ScrollbarGrab, titlebar_color.getRed(), titlebar_color.getGreen(), titlebar_color.getBlue(), titlebar_color.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.Button, titlebar_color.getRed(), titlebar_color.getGreen(), titlebar_color.getBlue(), titlebar_color.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.TextSelectedBg, titlebar_color.getRed(), titlebar_color.getGreen(), titlebar_color.getBlue(), titlebar_color.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.SliderGrabActive, titlebar_color.getRed(), titlebar_color.getGreen(), titlebar_color.getBlue(), titlebar_color.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.FrameBgHovered, titlebar_color.getRed(), titlebar_color.getGreen(), titlebar_color.getBlue(), titlebar_color.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.ResizeGripHovered, titlebar_color.getRed(), titlebar_color.getGreen(), titlebar_color.getBlue(), titlebar_color.getAlpha());

        ImGui.pushStyleColor(ImGuiCol.HeaderHovered, item_hovered.getRed(), item_hovered.getGreen(), item_hovered.getBlue(), item_hovered.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.ScrollbarGrabHovered, item_hovered.getRed(), item_hovered.getGreen(), item_hovered.getBlue(), item_hovered.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.ButtonHovered, item_hovered.getRed(), item_hovered.getGreen(), item_hovered.getBlue(), item_hovered.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.FrameBg, item_hovered.getRed(), item_hovered.getGreen(), item_hovered.getBlue(), item_hovered.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.ResizeGrip, item_hovered.getRed(), item_hovered.getGreen(), item_hovered.getBlue(), item_hovered.getAlpha());

        ImGui.pushStyleColor(ImGuiCol.HeaderActive, item_clicked.getRed(), item_clicked.getGreen(), item_clicked.getBlue(), item_clicked.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.ScrollbarGrabActive, item_clicked.getRed(), item_clicked.getGreen(), item_clicked.getBlue(), item_clicked.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.ButtonActive, item_clicked.getRed(), item_clicked.getGreen(), item_clicked.getBlue(), item_clicked.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.SliderGrab, item_clicked.getRed(), item_clicked.getGreen(), item_clicked.getBlue(), item_clicked.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.FrameBgActive, item_clicked.getRed(), item_clicked.getGreen(), item_clicked.getBlue(), item_clicked.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.ResizeGripActive, item_clicked.getRed(), item_clicked.getGreen(), item_clicked.getBlue(), item_clicked.getAlpha());
    
        ImGui.pushStyleColor(ImGuiCol.Text, text_color.getRed(), text_color.getGreen(), text_color.getBlue(), text_color.getAlpha());
        ImGui.pushStyleColor(ImGuiCol.CheckMark, text_color.getRed(), text_color.getGreen(), text_color.getBlue(), text_color.getAlpha());

        ImGui.setNextWindowPos(100.0f, 100.0f, ImGuiCond.FirstUseEver);
        ImGui.setNextWindowSize(600.0f, 400.0f, ImGuiCond.FirstUseEver);
    }
    
    @Override
    public void process() {
        ImGui.button("Load OBJ File...");

        ImGui.text("Model");
        ImGui.indent(150.0f);
        ImGui.image(1, 300.0f, 300.0f);
        ImGui.unindent(150.0f);

        ImGui.beginTable("Table", 2);
        ImGui.tableNextColumn();

        ImGui.text("Colormap");
        ImGui.image(1, 300.0f, 300.0f);
        ImGui.tableNextColumn();
        ImGui.text("Normalmap");
        ImGui.image(1, 300.0f, 300.0f);

        ImGui.text("Swizzle : ");

        ImGui.sameLine();
        ImGui.pushItemWidth(50.0f);
        
        ImInt current_x_index = new ImInt(0);
        String[] x_items = {"+X"};
        ImGui.combo("###X", current_x_index, x_items);
        
        ImGui.sameLine();
        
        ImInt current_y_index = new ImInt(0);
        String[] y_items = {"+Y"};
        ImGui.combo("###Y", current_y_index, y_items);

        ImGui.sameLine();
        
        ImInt current_z_index = new ImInt(0);
        String[] z_items = {"+Z"};
        ImGui.combo("###Z", current_z_index, z_items);

        ImGui.popItemWidth();
        ImGui.endTable();

        ImGui.button("Export...");
    }
    
    public static void main(String[] args) {
        launch(new App());
    }
}