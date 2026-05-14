const API_BASE = "http://localhost:8080/api";

async function loadUniversities() {
    const response = await fetch(`${API_BASE}/universities`);
    const universities = await response.json();

    const container = document.getElementById("universities");
    container.innerHTML = "";

    universities.forEach(university => {
        container.innerHTML += `
            <div class="card">
                <h3>${university.universityName}</h3>
                <p><strong>ID:</strong> ${university.universityId}</p>
                <p><strong>Code:</strong> ${university.universityCode}</p>
                <p><strong>Location:</strong> ${university.city}, ${university.stateProvince}, ${university.country}</p>
                <p><strong>Email:</strong> ${university.email}</p>
                <p><strong>Phone:</strong> ${university.phone}</p>
                <p><strong>Website:</strong> ${university.website}</p>
                <p><strong>Established:</strong> ${university.establishedYear}</p>
                <p><strong>Type:</strong> ${university.universityType}</p>
            </div>
        `;
    });
}

async function loadDepartments() {
    const response = await fetch(`${API_BASE}/departments`);
    const departments = await response.json();

    const container = document.getElementById("departments");
    container.innerHTML = "";

    departments.forEach(department => {
        container.innerHTML += `
            <div class="card department-card">
                <h3>${department.departmentName}</h3>
                <p><strong>ID:</strong> ${department.departmentId}</p>
                <p><strong>Code:</strong> ${department.departmentCode}</p>
                <p><strong>University ID:</strong> ${department.universityId}</p>
                <p><strong>Head:</strong> ${department.headOfDepartment}</p>
                <p><strong>Email:</strong> ${department.departmentEmail}</p>
                <p><strong>Phone:</strong> ${department.departmentPhone}</p>
                <p><strong>Building:</strong> ${department.buildingName}</p>
                <p><strong>Faculty:</strong> ${department.totalFaculty}</p>
                <p><strong>Students:</strong> ${department.totalStudents}</p>
            </div>
        `;
    });
}

async function loadUniversityDetails() {
    const universityId = document.getElementById("detailsUniversityId").value;

    const response = await fetch(`${API_BASE}/universities/${universityId}/details`);
    const data = await response.json();

    const container = document.getElementById("universityDetails");

    let departmentHtml = "";

    data.departments.forEach(department => {
        departmentHtml += `
            <div class="card department-card">
                <h4>${department.departmentName}</h4>
                <p><strong>Code:</strong> ${department.departmentCode}</p>
                <p><strong>Head:</strong> ${department.headOfDepartment}</p>
                <p><strong>Building:</strong> ${department.buildingName}</p>
                <p><strong>Students:</strong> ${department.totalStudents}</p>
            </div>
        `;
    });

    container.innerHTML = `
        <div class="card">
            <h3>${data.university.universityName}</h3>
            <p><strong>ID:</strong> ${data.university.universityId}</p>
            <p><strong>Code:</strong> ${data.university.universityCode}</p>
            <p><strong>City:</strong> ${data.university.city}</p>
            <p><strong>State:</strong> ${data.university.stateProvince}</p>
            <p><strong>Type:</strong> ${data.university.universityType}</p>
            <h3>Departments</h3>
            ${departmentHtml}
        </div>
    `;
}

document.getElementById("universityForm").addEventListener("submit", async function (event) {
    event.preventDefault();

    const university = {
        universityCode: document.getElementById("universityCode").value,
        universityName: document.getElementById("universityName").value,
        country: document.getElementById("country").value,
        stateProvince: document.getElementById("stateProvince").value,
        city: document.getElementById("city").value,
        address: document.getElementById("address").value,
        email: document.getElementById("email").value,
        phone: document.getElementById("phone").value,
        website: document.getElementById("website").value,
        establishedYear: Number(document.getElementById("establishedYear").value),
        universityType: document.getElementById("universityType").value
    };

    await fetch(`${API_BASE}/universities`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(university)
    });

    alert("University added successfully!");
    this.reset();
    loadUniversities();
});

document.getElementById("departmentForm").addEventListener("submit", async function (event) {
    event.preventDefault();

    const universityId = document.getElementById("departmentUniversityId").value;

    const department = {
        departmentName: document.getElementById("departmentName").value,
        departmentCode: document.getElementById("departmentCode").value,
        headOfDepartment: document.getElementById("headOfDepartment").value,
        departmentEmail: document.getElementById("departmentEmail").value,
        departmentPhone: document.getElementById("departmentPhone").value,
        buildingName: document.getElementById("buildingName").value,
        totalFaculty: Number(document.getElementById("totalFaculty").value),
        totalStudents: Number(document.getElementById("totalStudents").value)
    };

    await fetch(`${API_BASE}/universities/${universityId}/departments`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(department)
    });

    alert("Department added successfully!");
    this.reset();
    loadDepartments();
});

loadUniversities();
loadDepartments();