package com.performance.module_3_245

class Feature245UseCase2(
    private val repository: Feature245Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
