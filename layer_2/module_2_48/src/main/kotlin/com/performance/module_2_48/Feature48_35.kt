package com.performance.module_2_48

class Feature48UseCase1(
    private val repository: Feature48Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
