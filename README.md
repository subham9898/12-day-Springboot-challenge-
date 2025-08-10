
```markdown
# 🩸 Blood Report AI Analyzer

A Java Spring Boot + n8n + MySQL web app that:
- Takes a PDF blood report from the user
- Extracts text (OCR if scanned)
- Analyzes it using an AI model (OpenAI / Gemini)
- Returns a structured + human-readable report

Inspired by tools like SmallPDF, but built for **learning** and **automation-ready workflows**.

---

## 📌 Features
- PDF upload (supports scanned and digital)
- Text extraction with Apache PDFBox / Tesseract OCR
- AI analysis of blood parameters (status, causes, recommendations)
- Structured table + narrative report
- Optional PDF export of results
- MySQL storage for history
- n8n integration for AI calls or PDF generation

---

## 🗓 5-Day Build Roadmap

### **Day 1 – Project Setup & File Upload**
**Goals:**
- Create Spring Boot web app (Maven)
- Enable PDF upload (Multipart)
- Store uploaded file temporarily

**Steps:**
- Setup dependencies:
```

spring-boot-starter-web
spring-boot-starter-thymeleaf (or JSP)
spring-boot-starter-data-jpa
mysql-connector-j
commons-fileupload
pdfbox

```
- Folder structure:
```

/controller
/service
/model
/repository
/resources/templates (or JSP)

```
- File upload form (Thymeleaf/JSP)
- Controller to handle `MultipartFile` uploads

**AI Shortcut:**  
Ask GitHub Copilot:  
*"Generate Spring Boot controller to handle PDF file upload and save to local folder."*

---

### **Day 2 – PDF Text Extraction**
**Goals:**
- Extract text from PDF (digital or scanned)

**Steps:**
- For digital PDFs → **Apache PDFBox**
- For scanned PDFs → Convert to images + OCR with **Tesseract (tess4j)**
- Optional: Store extracted text in MySQL

**AI Shortcut:**  
Use n8n **PDF Extract Node** or **Google Cloud Vision API**.

---

### **Day 3 – AI Analysis Pipeline**
**Goals:**
- Send extracted text to AI model
- Receive structured & narrative analysis

**Options:**
- **In Spring Boot:** Call OpenAI/Gemini API with Java HTTP requests
- **In n8n:** Send extracted text to a webhook → AI Node → Return JSON

**Prompt Example:**
```

Analyze the following blood report data and give:

1. All parameter values
2. Status: Low / Normal / High
3. Possible causes
4. Suggestions
   Report text: {{EXTRACTED\_TEXT}}

````

---

### **Day 4 – Display Results**
**Goals:**
- Show table + summary in UI
- Enable PDF download

**Steps:**
- HTML table for: Parameter | Value | Normal Range | Status
- Summary section for recommendations
- Export as PDF with **iText/OpenPDF** or n8n HTML→PDF node

---

### **Day 5 – Polish & Deploy**
**Goals:**
- Clean UI
- Store history in MySQL
- Deploy to cloud

**Steps:**
- MySQL Table:
  ```sql
  CREATE TABLE reports (
      id BIGINT PRIMARY KEY AUTO_INCREMENT,
      filename VARCHAR(255),
      extracted_text TEXT,
      analysis TEXT,
      created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
  );
````

* History page listing all reports
* Deploy to Render / Railway / other hosting

---

## 📌 Automation vs Learning Mode

| Task           | Learn Mode (Manual)       | AI Shortcut (Automation)          |
| -------------- | ------------------------- | --------------------------------- |
| File upload    | Write controller code     | Copilot scaffold                  |
| PDF extraction | Apache PDFBox + Tesseract | n8n PDF Extract Node              |
| AI call        | Java HTTP request to API  | n8n OpenAI/Gemini Node            |
| Formatting     | Java parsing + HTML table | AI returns JSON → render directly |
| PDF export     | iText/OpenPDF             | n8n HTML→PDF Node                 |

---

## 🛠 Extended 12-Day Learning Plan

*(For mastering Spring Boot + AI integration)*

**Day 1:** Java OOP basics & BloodReport class
**Day 2:** Spring Boot setup & `/hello` endpoint
**Day 3:** REST APIs with `@RestController`
**Day 4:** MySQL + JPA setup
**Day 5:** AI analysis service (Hemoglobin)
**Day 6:** Add WBC analysis
**Day 7:** n8n webhook integration
**Day 8:** Validation with `@Valid`
**Day 9:** CRUD endpoints for reports
**Day 10:** JUnit testing + Postman tests
**Day 11:** Deploy to Render / Railway
**Day 12:** Final bugfix & demo

---

## 📚 Resources

* [Spring Boot Docs](https://spring.io/projects/spring-boot)
* [n8n Documentation](https://docs.n8n.io)
* [Apache PDFBox](https://pdfbox.apache.org/)
* [Tesseract OCR (tess4j)](https://tess4j.sourceforge.net/)
* [OpenAI API](https://platform.openai.com/docs)

---

## 🚀 Quick Start

1. Clone repo:

   ```bash
   git clone https://github.com/yourusername/blood-report-ai.git
   cd blood-report-ai
   ```
2. Add API keys in `.env` or `application.properties`
3. Run:

   ```bash
   mvn spring-boot:run
   ```
4. Open browser at `http://localhost:8080`

---

## 💡 Tip

For faster progress, build **core upload + AI integration** first.
Enhance with OCR, MySQL history, and PDF export after you get a working MVP.

```

---

Do you want me to also make a **workflow diagram** for this so your README has visuals?  
That would make it look more like a real SaaS project page.
```
