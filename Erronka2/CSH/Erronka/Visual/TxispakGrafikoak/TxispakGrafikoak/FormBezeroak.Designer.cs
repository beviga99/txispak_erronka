
namespace TxispakGrafikoak
{
    partial class FormBezeroak
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.gp_1 = new System.Windows.Forms.GroupBox();
            this.label1 = new System.Windows.Forms.Label();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.button1 = new System.Windows.Forms.Button();
            this.salmentakTableAdapter = new TxispakGrafikoak.TxispakDataSetTableAdapters.SalmentakTableAdapter();
            this.txispakDataSet = new TxispakGrafikoak.TxispakDataSet();
            this.salmentakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.button2 = new System.Windows.Forms.Button();
            this.kontrola1 = new BezeroakTaulaDLL.Kontrola();
            this.kontrola2 = new BezeroakDLL.Kontrola();
            this.gp_1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.salmentakBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // gp_1
            // 
            this.gp_1.Controls.Add(this.label1);
            this.gp_1.Controls.Add(this.pictureBox1);
            this.gp_1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.gp_1.ForeColor = System.Drawing.Color.White;
            this.gp_1.Location = new System.Drawing.Point(34, 26);
            this.gp_1.Name = "gp_1";
            this.gp_1.Size = new System.Drawing.Size(200, 100);
            this.gp_1.TabIndex = 5;
            this.gp_1.TabStop = false;
            this.gp_1.Text = "BEZEROAK GUZTIRA";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(108, 50);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(0, 20);
            this.label1.TabIndex = 1;
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::TxispakGrafikoak.Properties.Resources._526_5261793_people_icon_people_icon_white;
            this.pictureBox1.Location = new System.Drawing.Point(24, 34);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(60, 45);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 0;
            this.pictureBox1.TabStop = false;
            // 
            // button1
            // 
            this.button1.Image = global::TxispakGrafikoak.Properties.Resources.close;
            this.button1.Location = new System.Drawing.Point(996, 12);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(32, 32);
            this.button1.TabIndex = 8;
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // salmentakTableAdapter
            // 
            this.salmentakTableAdapter.ClearBeforeFill = true;
            // 
            // txispakDataSet
            // 
            this.txispakDataSet.DataSetName = "TxispakDataSet";
            this.txispakDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // salmentakBindingSource
            // 
            this.salmentakBindingSource.DataMember = "Salmentak";
            this.salmentakBindingSource.DataSource = this.txispakDataSet;
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(34, 511);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(75, 23);
            this.button2.TabIndex = 9;
            this.button2.Text = "BACK";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // kontrola1
            // 
            this.kontrola1.Location = new System.Drawing.Point(116, 190);
            this.kontrola1.Name = "kontrola1";
            this.kontrola1.Size = new System.Drawing.Size(357, 203);
            this.kontrola1.TabIndex = 0;
            // 
            // kontrola2
            // 
            this.kontrola2.Location = new System.Drawing.Point(567, 172);
            this.kontrola2.Name = "kontrola2";
            this.kontrola2.Size = new System.Drawing.Size(401, 252);
            this.kontrola2.TabIndex = 10;
            // 
            // FormProduktuak
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ControlDarkDark;
            this.ClientSize = new System.Drawing.Size(1040, 546);
            this.Controls.Add(this.kontrola2);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.gp_1);
            this.Controls.Add(this.kontrola1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "FormProduktuak";
            this.Text = "FormProduktuak";
            this.Load += new System.EventHandler(this.FormProduktuak_Load);
            this.gp_1.ResumeLayout(false);
            this.gp_1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.salmentakBindingSource)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private BezeroakTaulaDLL.Kontrola kontrola1;
        private System.Windows.Forms.GroupBox gp_1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Button button1;
        private TxispakDataSetTableAdapters.SalmentakTableAdapter salmentakTableAdapter;
        private TxispakDataSet txispakDataSet;
        private System.Windows.Forms.BindingSource salmentakBindingSource;
        private System.Windows.Forms.Button button2;
        private BezeroakDLL.Kontrola kontrola2;
    }
}