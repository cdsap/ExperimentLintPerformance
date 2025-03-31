package com.performance.module_3_245

class Feature245UseCase1(
    private val repository: Feature245Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
